/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.ControllerAdvisors;

/**
 *
 * @author Korisnik
 */
public class ClientException extends RuntimeException {
    public ClientException(){
        super("No available clients!");
    }
}
