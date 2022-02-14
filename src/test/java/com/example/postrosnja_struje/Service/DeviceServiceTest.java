/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.example.postrosnja_struje.Service;

import com.example.postrosnja_struje.Client;
import com.example.postrosnja_struje.Device;
import java.util.ArrayList;
import org.json.simple.JSONObject;
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
public class DeviceServiceTest {
    
    public DeviceServiceTest() {
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
     * Test of getSorted method, of class DeviceService.
     */
    @Test
    public void testGetSorted() {
        System.out.println("getSorted");
        String sortDirection = "";
        DeviceService instance = new DeviceService();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getSorted(sortDirection);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageableSortedDevice method, of class DeviceService.
     */
    @Test
    public void testGetPageableSortedDevice() {
        System.out.println("getPageableSortedDevice");
        int pageNumber = 0;
        int sizeElements = 0;
        String sortDir = "";
        DeviceService instance = new DeviceService();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getPageableSortedDevice(pageNumber, sizeElements, sortDir);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageableDevice method, of class DeviceService.
     */
    @Test
    public void testGetPageableDevice() {
        System.out.println("getPageableDevice");
        int pageNumber = 0;
        int sizeElements = 0;
        DeviceService instance = new DeviceService();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getPageableDevice(pageNumber, sizeElements);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPageableDeviceSort method, of class DeviceService.
     */
    @Test
    public void testGetPageableDeviceSort() {
        System.out.println("getPageableDeviceSort");
        int pageNumber = 0;
        int sizeElements = 0;
        ArrayList<Device> sorted = null;
        DeviceService instance = new DeviceService();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getPageableDeviceSort(pageNumber, sizeElements, sorted);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class DeviceService.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        DeviceService instance = new DeviceService();
        Client expResult = null;
        Client result = instance.equals();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateValue method, of class DeviceService.
     */
    @Test
    public void testGenerateValue() {
        System.out.println("generateValue");
        DeviceService instance = new DeviceService();
        double expResult = 0.0;
        double result = instance.generateValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateMonth method, of class DeviceService.
     */
    @Test
    public void testGenerateMonth() {
        System.out.println("generateMonth");
        DeviceService instance = new DeviceService();
        int expResult = 0;
        int result = instance.generateMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateYear method, of class DeviceService.
     */
    @Test
    public void testGenerateYear() {
        System.out.println("generateYear");
        DeviceService instance = new DeviceService();
        int expResult = 0;
        int result = instance.generateYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDevices method, of class DeviceService.
     */
    @Test
    public void testGetDevices() {
        System.out.println("getDevices");
        DeviceService instance = new DeviceService();
        ArrayList<Device> expResult = null;
        ArrayList<Device> result = instance.getDevices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDevice method, of class DeviceService.
     */
    @Test
    public void testAddDevice() {
        System.out.println("addDevice");
        Client client = null;
        double value = 0.0;
        int month = 0;
        int year = 0;
        DeviceService instance = new DeviceService();
        Device expResult = null;
        Device result = instance.addDevice(client, value, month, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateRecord method, of class DeviceService.
     */
    @Test
    public void testUpdateRecord() {
        System.out.println("updateRecord");
        Integer ID = null;
        String body = "";
        DeviceService instance = new DeviceService();
        boolean expResult = false;
        boolean result = instance.updateRecord(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteRecord method, of class DeviceService.
     */
    @Test
    public void testDeleteRecord() {
        System.out.println("deleteRecord");
        Integer ID = null;
        String body = "";
        DeviceService instance = new DeviceService();
        boolean expResult = false;
        boolean result = instance.deleteRecord(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewValue method, of class DeviceService.
     */
    @Test
    public void testAddNewValue() {
        System.out.println("addNewValue");
        Integer ID = null;
        String body = "";
        DeviceService instance = new DeviceService();
        String expResult = "";
        String result = instance.addNewValue(ID, body);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of totalYearValue method, of class DeviceService.
     */
    @Test
    public void testTotalYearValue() {
        System.out.println("totalYearValue");
        Integer ID = null;
        String year = "";
        DeviceService instance = new DeviceService();
        Double expResult = null;
        Double result = instance.totalYearValue(ID, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MonthsYearValue method, of class DeviceService.
     */
    @Test
    public void testMonthsYearValue() {
        System.out.println("MonthsYearValue");
        Integer ID = null;
        String year = "";
        DeviceService instance = new DeviceService();
        JSONObject expResult = null;
        JSONObject result = instance.MonthsYearValue(ID, year);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MonthOfYearValue method, of class DeviceService.
     */
    @Test
    public void testMonthOfYearValue() {
        System.out.println("MonthOfYearValue");
        Integer ID = null;
        String year = "";
        String month = "";
        DeviceService instance = new DeviceService();
        JSONObject expResult = null;
        JSONObject result = instance.MonthOfYearValue(ID, year, month);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
