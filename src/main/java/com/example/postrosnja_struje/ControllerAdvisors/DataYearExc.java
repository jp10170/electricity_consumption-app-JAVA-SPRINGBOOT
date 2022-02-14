/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.ControllerAdvisors;

/**
 *
 * @author Korisnik
 */
public class DataYearExc extends RuntimeException{
    public DataYearExc(){
        super("No data for that year, or ID device not okay");
    }
    
}
