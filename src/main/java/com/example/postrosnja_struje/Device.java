/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje;

import java.util.HashMap;


/**
 *
 * @author Korisnik
 */
public class Device implements Comparable<Device>{

    public Integer ID;
    public HashMap<String, Double> history;
    public Client client;
    
    public Device(){
        
    }
    
    public Device(Integer ID, Client client) {
        this.ID = ID;
        this.client = client;
    }
    
    public void addToHistory(String date, Double value){
        history.put(date, value);
    }
    
    public void deleteFromHistory(String date){
        history.remove(date);
    }

    public Device(Integer ID, HashMap<String, Double> history, Client client) {
        this.ID = ID;
        this.history = history;
        this.client = client;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public Device(HashMap<String, Double> history,Client client) {
        
        this.history = history;
        this.client = client;
    }
    
    public HashMap<String, Double> getHistory(){
        return history;
    }
    
    public void setHistory(HashMap<String, Double> history){
        this.history = history;
    }

    @Override
    public int compareTo(Device o) {
         return this.ID.compareTo(o.ID);//-1, this.ID je manji od o.ID, sortira uzlazno po ID-u,  1,2,3,4,...
       
    }
}
