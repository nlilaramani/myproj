/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author itexps
 */
public class Employee {
    private int id;
    private String name;
    private double monthlySalary;
    
    public Employee(){
        
    }
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.monthlySalary=salary;
    }
    
    public void getInfo(){
        System.out.println("***********");
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Monthly Salary:"+monthlySalary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    public double getAnnualSalary(){
        return monthlySalary*12;
    }
    
}
