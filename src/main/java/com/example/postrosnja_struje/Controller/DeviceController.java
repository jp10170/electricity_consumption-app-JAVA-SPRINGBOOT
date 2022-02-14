/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.Controller;

import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.ControllerAdvisors.ClientException;
import com.example.postrosnja_struje.ControllerAdvisors.DataYearExc;
import com.example.postrosnja_struje.ControllerAdvisors.QuerryParam;
import com.example.postrosnja_struje.ControllerAdvisors.YearMonthExc;
import com.example.postrosnja_struje.ControllerAdvisors.yearException;
import com.example.postrosnja_struje.Device;
import com.example.postrosnja_struje.Service.DeviceService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.ConstraintViolationException;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.json.simple.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Korisnik
 */
@RestController
@Validated
public class DeviceController {

    public DeviceService service;

    DeviceController(DeviceService service) {
        this.service = service;
    }

    @GetMapping(value = "/devices")
    ArrayList<Device> all() {    
        
        return service.getDevices();
    }

    @GetMapping(value = "/devices/paginated")
    ResponseEntity<List<Device>> all(@RequestParam(name = "page", required = false) Integer page,
            @RequestParam(name = "size", required = false) Integer size,
            @RequestParam(name = "sort", required = false) String sortDirection) {      
        if(sortDirection != null){
            return new ResponseEntity<List<Device>>(service.getPageableSortedDevice(page, size, sortDirection), HttpStatus.OK);
        }
        else
            return new ResponseEntity<List<Device>>(service.getPageableDevice(page, size), HttpStatus.OK);
    }
    
    
    
    
    
    // --------------------------------------QUERRYS
    
    @RequestMapping(value = "/querry", method = {RequestMethod.GET})
    @ResponseBody
    public ResponseEntity<String> querryValues(@RequestParam(name = "year", required = false)
            @Size(min = 4, max=4, message = "Year must be 4 digit!!")
            String year,
            @RequestParam(name = "ID") @Min(value = 1, message = "ID must be minimally 1") Integer ID,
            @RequestParam (name = "month", required = false) @Max(value = 12, message = "Month must be 1-12") 
            @Min(value = 1, message = "Month must be 1-12") Integer month,
            @RequestParam(name = "querry") String querry){
        
        if(querry.equals("totalYear")){
            if(year == null){
                throw new yearException();
            }
            JSONObject json = new JSONObject();
            Double total = service.totalYearValue(ID, year);
            if(total == null)
                throw new DataYearExc();

            json.put("Godina: " + year, "Ukupno potrosnja:" + total);
            return new ResponseEntity<String>(json.toJSONString(), HttpStatus.OK);
        }
        if(querry.equals("monthsYear")){
            if(year == null){
                throw new yearException();
            }
            JSONObject json = service.MonthsYearValue(ID, year);
            if(json == null){
                throw new DataYearExc();
            }
            return new ResponseEntity<String>(json.toJSONString(), HttpStatus.OK);
        }
        if(querry.equals("monthYear")){
            JSONObject json = service.MonthOfYearValue(ID, year, month.toString());
            if(month == null || year == null){
                throw new YearMonthExc();
            }
            if(json == null){
                throw new DataYearExc();
            }
            return new ResponseEntity<String>(json.toJSONString(), HttpStatus.OK);
        }
        throw new QuerryParam();
    }
    
    

    //----------------------------------DEVICE CRUD
    
    @RequestMapping(value = "/adValue", method = {RequestMethod.PUT})
    ResponseEntity<String> adRecord(@RequestBody Device device) {
        Map.Entry<String,Double> entry = device.history.entrySet().iterator().next();
        String key = entry.getKey();
        Double value = entry.getValue();
        String succes = service.addRecord(device.ID,key,value);
        if("good".equals(succes)){
            return new ResponseEntity<String>("Record added!", HttpStatus.OK);
        }
        return new ResponseEntity<String>("Record allready exist or bad ID!", HttpStatus.BAD_REQUEST);
    }
    
    
    @RequestMapping(value = "/updateValue/{ID}", method = {RequestMethod.PUT})
    ResponseEntity<String> updateRecord(@PathVariable(value = "ID") Integer ID, @RequestBody String body) {
        Boolean succes = service.updateRecord(ID, body);
        return new ResponseEntity<String>("Record updated with new value!", HttpStatus.OK);
    }

    @RequestMapping(value = "/addRecord/{ID}", method = {RequestMethod.POST})
    ResponseEntity<String> addNewValue(@PathVariable(value = "ID") Integer ID, @RequestBody String body) {
        System.out.println(body);
        String error = service.addNewValue(ID, body);
        return new ResponseEntity<String>("Added new value!", HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{ID}", method = {RequestMethod.DELETE})
    ResponseEntity<String> delete(@PathVariable(value = "ID") Integer ID, @RequestBody String body) {
        
       boolean succes = service.deleteRecord(ID, body);
       return new ResponseEntity<String>("Record is deleted!", HttpStatus.OK);
    }

    @RequestMapping(value = "/newDevice", method = {RequestMethod.POST}) //controller advice!!
    ResponseEntity<String> newDevice() {
        double value = service.generateValue();
        int month = service.generateMonth();
        int year = service.generateYear();

        Client client = service.equals();
        if (client == null) {
            throw new ClientException();
        }
        service.addDevice(client, value, month, year);
        return new ResponseEntity<String>("Device added!", HttpStatus.OK);
    }

    

}
