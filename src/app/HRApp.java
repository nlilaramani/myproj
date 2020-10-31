/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import oop.Employee;
import oop.Manager;

/**
 *
 * @author itexps
 */
public class HRApp {
    
    public static void calculateTax(Employee e){
        System.out.println("Annual Salary:"+e.getAnnualSalary());  // Polymorphism
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee e=new Employee();
        e.setId(123);
        e.setName("Robert");
        e.setMonthlySalary(6000.00);
        e.getInfo();
        Manager m=new Manager();
        m.setId(789);
        m.setName("Bob");
        m.setMonthlySalary(10000.00);
        m.getInfo();
        m.setAnnualBonus(10000.00);
        calculateTax(e); // e -> Employee
        calculateTax(m); // m -> Manager (?) e=m
        Employee e1; // Employee variable
        
        e1=m; // Manager is an employee
        Manager m1;
        //m1=e1;   // Explicit Typecasting
        
        
    }
    
}
