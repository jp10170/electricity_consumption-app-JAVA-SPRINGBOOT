/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.example.postrosnja_struje;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Korisnik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.example.postrosnja_struje.PostrosnjaStrujeApplicationTest.class, com.example.postrosnja_struje.ListdataTest.class, com.example.postrosnja_struje.ClientTest.class, com.example.postrosnja_struje.Controller.ControllerSuite.class, com.example.postrosnja_struje.MyRunnerTest.class, com.example.postrosnja_struje.Service.ServiceSuite.class, com.example.postrosnja_struje.DeviceTest.class, com.example.postrosnja_struje.Repository.RepositorySuite.class})
public class Postrosnja_strujeSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
