/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import java.util.*;
import com.example.model.*;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Korisnik
 */
@Controller
public class deviceController {
    private RestTemplate restTemplate;
    
    @Autowired
    public DeviceService service;

    
    @Autowired
    public deviceController(RestTemplateBuilder builder){
        this.restTemplate = builder.build();
        
    }

    @GetMapping("/showDevice")
    public String get(Model model){
        String backendURL = "http://localhost:8080/devices";
        Device[] object = restTemplate.getForObject(backendURL, Device[].class);
        model.addAttribute("devices", object);
        return "showDevice";
    }
    
    
     @GetMapping("/addValues")
    public String getForm(Model model){
        
        model.addAttribute("device", new Device());
        
        return "addValues";
    }
    
    @PostMapping("/addValues")
    public String pos(@ModelAttribute Device device, Model model){
        
        restTemplate.postForLocation("http://localhost:8080/addRecord/" + device.getID().toString(),  service.makeBody(device));
        return "addValues";
    }
    
    
    
}
