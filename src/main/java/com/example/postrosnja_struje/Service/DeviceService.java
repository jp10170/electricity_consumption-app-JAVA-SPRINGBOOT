/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.postrosnja_struje.Service;

import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.ControllerAdvisors.dateformatexc;
import com.example.postrosnja_struje.ControllerAdvisors.maxException;
import com.example.postrosnja_struje.Device;
import com.example.postrosnja_struje.Listdata;
import com.example.postrosnja_struje.Repository.Devicerepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Korisnik
 */
@Service

public class DeviceService implements Listdata {

    @Autowired
    public Devicerepository repository;

    public DeviceService() {
    }

    public ArrayList<Device> getSorted(String sortDirection) { 
        ArrayList<Device> all = repository.getDevices();
        Collections.sort(all); 
        if (sortDirection.contains("asc")) {
            return all;
        }
        Collections.reverse(all); 
        return all;
    }

    public ArrayList<Device> getPageableSortedDevice(int pageNumber, int sizeElements, String sortDir) {
        ArrayList<Device> sorted = getSorted(sortDir);
        return getPageableDeviceSort(pageNumber, sizeElements, sorted);
    }

    public ArrayList<Device> getPageableDevice(int pageNumber, int sizeElements) { //2/2
        int max = 10;
        ArrayList<Device> all = repository.getDevices();
        int startWithDeviceIndex = (sizeElements) * (pageNumber - 1); //2
        int endWithDeviceIndex = (sizeElements) * (pageNumber) - 1;   //3
        if(sizeElements>max){
            throw new maxException();
        }

        ArrayList<Device> paginated = new ArrayList<>();
        for (int i = 0; i < all.size(); i++) {
            if (i >= startWithDeviceIndex && i <= endWithDeviceIndex) {
                paginated.add(all.get(i));
            }
        }
        return paginated;
    }

    public ArrayList<Device> getPageableDeviceSort(int pageNumber, int sizeElements, ArrayList<Device> sorted) { 

        int startWithDeviceIndex = (sizeElements) * (pageNumber - 1);
        int endWithDeviceIndex = (sizeElements) * (pageNumber) - 1;

        ArrayList<Device> paginated = new ArrayList<>();
        for (int i = 0; i < sorted.size(); i++) {
            if (i >= startWithDeviceIndex && i <= endWithDeviceIndex) {
                paginated.add(sorted.get(i));
            }
        }
        return paginated;
    }

    public Client equals() {
        if (data.isEmpty()) {
            Client client = clients.get(0);
            return client;
        }
        List<Client> possibleClients = clients;

        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            for (int j = 0; j < data.size(); j++) {
                Device device = data.get(j);
                if (client.adress.equals(device.client.adress)) {
                    possibleClients.remove(client);
                }
            }
        }
        if (possibleClients.isEmpty()) {
            return null;
        }
        return possibleClients.get(0);
    }

    public double generateValue() {
        double min = 1;
        double max = 10000;
        double value = ThreadLocalRandom.current().nextDouble(min, max + 1);
        return value;
    }

    public int generateMonth() {
        int min = 1;
        int max = 12;
        int value = ThreadLocalRandom.current().nextInt(min, max + 1);
        return value;
    }

    public int generateYear() {
        int min = 2019;
        int max = 2021;
        int value = ThreadLocalRandom.current().nextInt(min, max + 1);
        return value;
    }

    public ArrayList<Device> getDevices() {
        ArrayList<Device> devices = repository.getDevices();
        Collections.sort(devices);
        return devices;
    }
    
    
    public Device addDevice(Client client, double value, int month, int year) {
        String date = month + "/" + year;
        return repository.addDevice(value, date, client);
    }
    

    public boolean updateRecord(Integer ID, String body) {
        String Date = "";
        Double newValue = Double.valueOf(0);
        try {
            Object obj = new JSONParser().parse(body);
            JSONObject jo = (JSONObject) obj;
            Iterator<Map.Entry> itr1 = jo.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                String key = (String) pair.getKey();
                if (key.equals("date")) {
                    String value = (String) pair.getValue();
                    Date = value;
                } else {
                    newValue = (Double) pair.getValue();
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(DeviceService.class.getName()).log(Level.SEVERE, null, ex);
        }
        Boolean bol = repository.updateHistoryRecord(ID, Date, newValue);
        return bol;
    }

    public boolean deleteRecord(Integer ID, String body) {
        String Date = "";
        Double Value = Double.valueOf(0);
        try {
            Object obj = new JSONParser().parse(body);
            JSONObject jo = (JSONObject) obj;
            Iterator<Map.Entry> itr1 = jo.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                String key = (String) pair.getKey();
                if (key.equals("date")) {
                    String value = (String) pair.getValue();
                    Date = value;
                } else {
                    Value = (Double) pair.getValue();
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(DeviceService.class.getName()).log(Level.SEVERE, null, ex);
        }
        Boolean bol = repository.deleteHistoryRecord(ID, Date);
        return bol;
    }

    public String addNewValue(Integer ID, String body) { 
        String newDate = "";
        Double newValue = Double.valueOf(0);

        try {
            Object obj = new JSONParser().parse(body);
            JSONObject jo = (JSONObject) obj;
            Iterator<Map.Entry> itr1 = jo.entrySet().iterator();
            while (itr1.hasNext()) {
                Map.Entry pair = itr1.next();
                String key = (String) pair.getKey();
                if (key.equals("date")) {
                    String value = (String) pair.getValue();
                    newDate = value;
                } else {
                   String ewValue = pair.getValue().toString();
                   newValue = Double.parseDouble(ewValue);
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(DeviceService.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*String error = "";
        String[] d = newDate.split("/");
        int m = Integer.parseInt(d[0]);
        if(m > 12 || m <= 0){
            throw new dateformatexc();
        }*/
        return repository.addtoHistory(ID, newDate, newValue);
    }

 

    //-------------------------------QUERYS
    public Double totalYearValue(Integer ID, String year) {
        double total = 0;
        boolean hasData = false;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getID().equals(ID)) {
                Iterator it = data.get(i).history.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    Double value = (Double) pair.getValue();
                    String date = (String) pair.getKey();
                    String[] d = date.split("/");
                    String y = d[1];
                    if (y.equals(year)) {
                        hasData = true;
                        total = total + value;
                    }
                }
            }
        }
        if (hasData) {
            return total;
        } else {
            return null;
        }
    }

    public JSONObject MonthsYearValue(Integer ID, String year) {
        JSONObject json = new JSONObject();
        boolean hasData = false;
        String[] mjeseci = {"Sijecanj", "Veljaca", "Ozujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getID().equals(ID)) {
                for (int j = 0; j < 12; j++) {
                    Iterator it = data.get(i).history.entrySet().iterator();
                    double total = 0;
                    while (it.hasNext()) {
                        Map.Entry pair = (Map.Entry) it.next();
                        Double value = (Double) pair.getValue();
                        String date = (String) pair.getKey();
                        String[] d = date.split("/");
                        String mo = String.valueOf(j + 1);
                        String m = d[0];
                        String y = d[1];
                        if ((y.equals(year)) && (m.equals(mo))) {
                            total = value;
                            hasData = true;
                        }
                    }
                    json.put(mjeseci[j], total);
                }
                if (hasData) {
                    return json;
                }
            }
        }
        if (hasData) {
            return json;
        } else {
            return null;
        }
    }

    public JSONObject MonthOfYearValue(Integer ID, String year, String month) {
        JSONObject json = new JSONObject();
        Boolean hasData = false;
        String[] mjeseci = {"Sijecanj", "Veljaca", "Ozujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getID().equals(ID)) {
                Iterator it = data.get(i).history.entrySet().iterator();
                double total = 0;
                while (it.hasNext()) {
                    Map.Entry pair = (Map.Entry) it.next();
                    Double value = (Double) pair.getValue();
                    String date = (String) pair.getKey();
                    String[] d = date.split("/");
                    String m = d[0];
                    String y = d[1];
                    if ((y.equals(year)) && (m.equals(month))) {
                        hasData = true;
                        total = value;
                        json.put("Godina: " + year + "mjesec: " + mjeseci[Integer.parseInt(month) - 1], "Postrosnja: " + total);
                        break;
                    }
                }
            }
        }
        if (hasData == false) {
            return null;
        } else {
            return json;
        }
    }
    
    public String addRecord(Integer ID, String date, Double value) {
        return repository.addtoHistory(ID, date, value);
    }
}
