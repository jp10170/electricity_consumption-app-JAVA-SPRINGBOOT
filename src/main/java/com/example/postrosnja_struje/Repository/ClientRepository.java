/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.Repository;


import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.Listdata;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Korisnik
 */

@Repository
public class ClientRepository implements Listdata {
    
    public ClientRepository(){
        
    }
    
    public void addClientsJSon() throws FileNotFoundException, IOException{
        try {
            Object obj = new JSONParser().parse(new FileReader("JSON.json"));
            JSONObject jo = (JSONObject) obj;
            Map cl = ((Map)jo.get("clients"));
            Iterator<Map.Entry> itr1 = cl.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                String name = (String) pair.getKey();
                String adress = (String) pair.getValue();
                Client client = new Client(name, adress);
                
                if(clients.isEmpty()){
                    clients.add(client);
                }
                if(!clients.isEmpty()){
                    
                    boolean bol = true;
                    for(int i = 0; i < clients.size(); i++){
                        Client c = clients.get(i);
                        if((client.adress.equalsIgnoreCase(c.adress)) || (client.name.equalsIgnoreCase(c.name))){
                            bol=false;
                            break; 
                        }
                    }
                    if(bol == true){
                        clients.add(client);
                    }
                    
                }
        }
        } catch (ParseException ex) {
            Logger.getLogger(ClientRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
