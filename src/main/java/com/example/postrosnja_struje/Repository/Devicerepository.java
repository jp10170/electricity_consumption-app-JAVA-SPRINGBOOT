/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.Repository;

import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.ControllerAdvisors.DatenotfoundExc;
import com.example.postrosnja_struje.ControllerAdvisors.IDexception;
import com.example.postrosnja_struje.ControllerAdvisors.RecordExistsException;
import com.example.postrosnja_struje.Device;

import com.example.postrosnja_struje.Listdata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Korisnik
 */
@Repository
public class Devicerepository implements Listdata { 
    public Devicerepository(){
        
    }
    
    public Device addDevice(double value, String date, Client cl){
        HashMap<String, Double> h = new HashMap<String, Double>();
        int newid = data.size()+1;
        
        h.put(date, value);
        Device d = new Device(newid, h,cl);
        data.add(d);
        return d;
    }
    
    
    public ArrayList<Device> getDevices(){
        return data;
    }
    
    public boolean updateHistoryRecord(Integer ID, String date, Double newValue){
        Boolean bol = false;
        for(int i=0; i < data.size(); i++) {
            if(data.get(i).getID().equals(ID)){
                bol = true;
                if(data.get(i).history.containsKey(date)){
                    data.get(i).history.replace(date, newValue);
                    bol = true;
                    return bol;
                }
            }
        }
        if(bol == true){
            throw new DatenotfoundExc();
        }
        throw new IDexception();
    }
    
    public boolean deleteHistoryRecord(Integer ID, String date){
        boolean bol= false;
        for(int i=0; i < data.size(); i++) {
            if(data.get(i).getID().equals(ID)){
                bol = true;
                if(data.get(i).history.containsKey(date)){
                    data.get(i).history.remove(date);
                    bol = true;
                    return bol;
                }
            }
        }
        if(bol == true){
            throw new DatenotfoundExc();
        }
        throw new IDexception();
    }

    public String addtoHistory(Integer ID, String newDate, Double newValue) {
        String error = "good";
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).getID().equals(ID)){
                if(data.get(i).getHistory().containsKey(newDate)){
                    throw new RecordExistsException();
                }
                else{
                    data.get(i).addToHistory(newDate, newValue);
                    return error;
                }
            }
        }
        throw new IDexception();
    }
}
