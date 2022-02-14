/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import java.util.HashMap;

/**
 *
 * @author Korisnik
 */
public class Device {
    public Integer ID;
    public HashMap<String, Double> history;
    public Client client;
    public String key;
    public Double value;
    
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
    
    public void setHistory(HashMap<String, Double> history, Double value, String string){
        this.history = history;
    }
    
    public Device(HashMap<String, Double> history) {
        
        this.history = history;
    }
    
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    

}
