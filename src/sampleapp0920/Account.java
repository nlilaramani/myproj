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
public class Account {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // balance, number, name, age, address, type, active
        double balance=1000.50;
        int number=123456;
        String name="Bob";
        int age=26;
        String address="951A Plum Grove Rd Schumburg IL 60173";
        char type='S';
        boolean isActive=true;
        System.out.println("**** Account information ");
        System.out.println("Balance:"+balance);
        System.out.println("Account Number:"+number);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
        System.out.println("Type:"+type);
        System.out.println("Active:"+isActive);
        System.out.println("*******************");
    }
    
}
