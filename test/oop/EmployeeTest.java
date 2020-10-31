/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author itexps
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    Employee instance;
    @Before
    public void setUp() {
        instance = new Employee();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInfo method, of class Employee.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        Employee instance = new Employee();
        instance.setId(123);
        instance.setName("ABC");
        instance.getInfo();
        int id=instance.getId();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(123, id);
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Employee instance = new Employee();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Employee instance = new Employee();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Employee instance = new Employee();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Employee instance = new Employee();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonthlySalary method, of class Employee.
     */
    @Test
    public void testGetMonthlySalary() {
        System.out.println("getMonthlySalary");
        Employee instance = new Employee();
        double expResult = 0.0;
        double result = instance.getMonthlySalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMonthlySalary method, of class Employee.
     */
    @Test
    public void testSetMonthlySalary() {
        System.out.println("setMonthlySalary");
        double monthlySalary = 0.0;
        Employee instance = new Employee();
        instance.setMonthlySalary(monthlySalary);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnnualSalary method, of class Employee.
     */
    @Test
    public void testGetAnnualSalary() {
        System.out.println("getAnnualSalary");
        Employee instance = new Employee();
        double expResult = 0.0;
        double result = instance.getAnnualSalary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
