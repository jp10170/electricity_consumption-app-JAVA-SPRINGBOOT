/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje;

import com.example.postrosnja_struje.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Korisnik
 */
@Component
public class MyRunner implements CommandLineRunner, Listdata {
    
    @Autowired
    ClientRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.addClientsJSon();
        for(int i = 0; i < clients.size(); i++){
            Client c = clients.get(i);
            System.out.println(c.name + " " + c.adress);
        }

    }
}

