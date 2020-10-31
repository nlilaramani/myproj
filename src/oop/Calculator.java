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
public class Calculator {
    // Utility methods
    // Method overloading
    public static int add(int n1, int n2){
        return n1+n2;
    }

    public static double add(double n1, double n2){
        return n1+n2;
    }
    public static int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public static int sub(int n1, int n2){
        return n1-n2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator c=new Calculator();
        double r=c.add(10,20);
        System.out.println("Add result:"+r);
        double d=c.add(10.4,30.5);
        System.out.println("Decimal result:"+d);
        r=c.add(3,4,5);
        System.out.println("Add result:"+r);
        System.out.println(c.add(10.0, 40.5)); // Auto type casting
       
    }
    
}
