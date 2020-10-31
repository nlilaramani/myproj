/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleapp0920;

import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age;
        double creditBalance;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.print("Enter the Age of Driver:");
        age=sc.nextInt();
        System.out.print("Enter the Credit Balance of Driver:");
        creditBalance=sc.nextDouble();
        
        
        
        if(age>=21 && creditBalance>=10000.00){
            System.out.println("Congratulations! You can rent a car");
        }else{
            System.out.println("Sorry! You can not rent a car!");
        }
    }
    
}
