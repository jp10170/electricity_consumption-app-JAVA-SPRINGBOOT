/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.postrosnja_struje.Controller;

import com.example.postrosnja_struje.Device;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Korisnik
 */
public class DeviceControllerTest {
    
    public DeviceControllerTest() {
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
     * Test of all method, of class DeviceController.
     */
    @Test
    public void testAll_0args() {
        System.out.println("all");
        DeviceController instance = null;
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.all();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of all method, of class DeviceController.
     */
    @Test
    public void testAll_3args() {
        System.out.println("all");
        Integer page = null;
        Integer size = null;
        String sortDirection = "";
        DeviceController instance = null;
        ResponseEntity<List<Device>> expResult = null;
        ResponseEntity<List<Device>> result = instance.all(page, size, sortDirection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateRecord() {
        System.out.println("updateRecord");
        Integer ID = null;
        String body = "";
        DeviceController instance = null;
        ResponseEntity<String> expResult = null;
        ResponseEntity<String> result = instance.updateRecord(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewValue method, of class DeviceController.
     */
    @Test
    public void testAddNewValue() {
        System.out.println("addNewValue");
        Integer ID = null;
        String body = "";
        DeviceController instance = null;
        ResponseEntity<String> expResult = null;
        ResponseEntity<String> result = instance.addNewValue(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class DeviceController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer ID = null;
        String body = "";
        DeviceController instance = null;
        ResponseEntity<String> expResult = null;
        ResponseEntity<String> result = instance.delete(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of newDevice method, of class DeviceController.
     */
    @Test
    public void testNewDevice() {
        System.out.println("newDevice");
        DeviceController instance = null;
        ResponseEntity<String> expResult = null;
        ResponseEntity<String> result = instance.newDevice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
