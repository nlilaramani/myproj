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
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // AND && Operartor
        // Binary operator
        // Reult is also logical (true or false)
        // Truth table for and operator
        System.out.println(5==5 && 10>9); // result true
        System.out.println(4>5 && 11>9); // false
        System.out.println(12>10 && 5!=5);
        System.out.println(100>200 && 200>3000);
        // OR || Operator
        // Binary operator
        // Result is also logical (true or false)
        // Truth table for OR operation
        System.out.println(10==10 || 5==5); // true
        System.out.println(10==10 || 4>5); // true
        System.out.println(11>10 || 40<50); // true
        System.out.println(10>11 || 200>50); // false
        //NOT ! - Unary operatror
        // Inverses the value of input operand
        // Result is logical
        System.out.println(!(4>5)); // result is false
        System.out.println(!(10==10)); // result is true
        
        
    }
    
}
