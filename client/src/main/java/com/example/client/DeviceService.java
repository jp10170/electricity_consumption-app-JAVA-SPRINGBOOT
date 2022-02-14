/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.client;

import com.example.model.Device;
import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author Korisnik
 */
@Service
public class DeviceService {
    
    
    public HashMap makeBody(Device device){
        String ID = device.getID().toString();
        String key = device.getKey();
        String value = device.getValue().toString();
        HashMap<String, String> map = new HashMap();
        map.put("date", key);
        map.put("value", value);
        return map;
    }
}
