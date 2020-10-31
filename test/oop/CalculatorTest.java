/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import junit.framework.Assert;
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
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    
    @BeforeClass        // Executed before each class
    public static void setUpClass() {
        c=new Calculator();
        System.out.println("***SetUpClass Method Executed***");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    static Calculator c; //Instance Variable
    // Setup a test harness for each test
    // Pre-requisites for each test
    @Before     //Executed before each unit test
    public void setUp() {
        //c=new Calculator();
        System.out.println("***SetUp Method Executed***");
    }
    
    @After  //Executed after each unit test
    public void tearDown() {
        c=null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdd(){
        int result=c.add(10,20);
        int expectedResult=30;
        Assert.assertEquals(expectedResult,result);
        System.out.println("*** testAdd() Executed***");
    }
    @Test
    public void testAdd1(){
        int result=c.add(10,20);
        int expectedResult=20;
        Assert.assertEquals(expectedResult,result);
        System.out.println("*** testAdd1() Executed***");
    }
    @Test
    public void testSub(){
        int result=c.sub(20,10);
        int expectedResult=10;
        Assert.assertEquals(expectedResult,result);
        System.out.println("*** testSub() Executed***");
    }
}
