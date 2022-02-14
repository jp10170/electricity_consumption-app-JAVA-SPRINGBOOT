/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.postrosnja_struje.Repository;

import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.Device;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Korisnik
 */
public class DevicerepositoryTest {
    
    public DevicerepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addDevice method, of class Devicerepository.
     */
    @Test
    public void testAddDevice() {
        System.out.println("addDevice");
        double value = 0.0;
        String date = "";
        Client cl = null;
        Devicerepository instance = new Devicerepository();
        Device expResult = null;
        Device result = instance.addDevice(value, date, cl);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevices method, of class Devicerepository.
     */
    @Test
    public void testGetDevices() {
        System.out.println("getDevices");
        Devicerepository instance = new Devicerepository();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getDevices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateHistoryRecord method, of class Devicerepository.
     */
    @Test
    public void testUpdateHistoryRecord() {
        System.out.println("updateHistoryRecord");
        Integer ID = null;
        String date = "";
        Double newValue = null;
        Devicerepository instance = new Devicerepository();
        boolean expResult = false;
        boolean result = instance.updateHistoryRecord(ID, date, newValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteHistoryRecord method, of class Devicerepository.
     */
    @Test
    public void testDeleteHistoryRecord() {
        System.out.println("deleteHistoryRecord");
        Integer ID = null;
        String date = "";
        Devicerepository instance = new Devicerepository();
        boolean expResult = false;
        boolean result = instance.deleteHistoryRecord(ID, date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addtoHistory method, of class Devicerepository.
     */
    @Test
    public void testAddtoHistory() {
        System.out.println("addtoHistory");
        Integer ID = null;
        String newDate = "";
        Double newValue = null;
        Devicerepository instance = new Devicerepository();
        String expResult = "";
        String result = instance.addtoHistory(ID, newDate, newValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
