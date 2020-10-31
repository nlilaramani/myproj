/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp0920;

/**
 *
 * @author itexps
 */
public class NumberOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(200+500); // Addition
        System.out.println(400-100); // subtration
        System.out.println(200*500); // Multiplication
        
        System.out.println(10.0/3.0); // Division
        
        System.out.println(10%3); // Returns reminder of the division operation
        System.out.println(10000.00-595.78);
        System.out.println(11/4);
        System.out.println(200.2*300.4);
        System.out.println(10+(50-40)*2); // 10+50-80 -> 60 - 80 -> -20
        System.out.println(100.2+50.3-40.4*2.6);//
        System.out.println(10+(50-40)*2); // 10 + 10*2 -> 10 + 20 -> 30
        int a;
        a=10+30; // +, = , a=40
        a=a+1;
        System.out.println(a);
        a++; // Increment operator
        System.out.println(a);
        ++a;
        System.out.println(a);
        a--;
        System.out.println(a);
        a=a+50; // First add 50 to a and assign result back to a
        System.out.println(a);
        a+=50; // Add 50 to a
        System.out.println(a);
        a-=30; //Subtract 30 from a's value
        System.out.println(a);
        
        double i=100; // 100.0, safe auto type casting
        int j=30; // no type casting
        double result=i/j; // 3 -> 3.0
        System.out.println(result);
        int x=(int)200.50; // 8 -> 4, forced type casting
        System.out.println(x);
        
        
        
        
        
    
    }
    
}
