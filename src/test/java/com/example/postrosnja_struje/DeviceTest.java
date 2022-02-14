/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.postrosnja_struje;

import java.util.HashMap;
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
public class DeviceTest {
    
    public DeviceTest() {
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
     * Test of addToHistory method, of class Device.
     */
    @Test
    public void testAddToHistory() {
        System.out.println("addToHistory");
        String date = "";
        Double value = null;
        Device instance = new Device();
        instance.addToHistory(date, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFromHistory method, of class Device.
     */
    @Test
    public void testDeleteFromHistory() {
        System.out.println("deleteFromHistory");
        String date = "";
        Device instance = new Device();
        instance.deleteFromHistory(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Device.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Device instance = new Device();
        Integer expResult = null;
        Integer result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setID method, of class Device.
     */
    @Test
    public void testSetID() {
        System.out.println("setID");
        Integer ID = null;
        Device instance = new Device();
        instance.setID(ID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClient method, of class Device.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        Device instance = new Device();
        Client expResult = null;
        Client result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class Device.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Client client = null;
        Device instance = new Device();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistory method, of class Device.
     */
    @Test
    public void testGetHistory() {
        System.out.println("getHistory");
        Device instance = new Device();
        HashMap<String, Double> expResult = null;
        HashMap<String, Double> result = instance.getHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHistory method, of class Device.
     */
    @Test
    public void testSetHistory() {
        System.out.println("setHistory");
        HashMap<String, Double> history = null;
        Device instance = new Device();
        instance.setHistory(history);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Device.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Device o = null;
        Device instance = new Device();
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
