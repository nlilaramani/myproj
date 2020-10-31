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
public class MPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double miles=46.0;
        double gallons=2.3;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter miles driven:");
        miles=sc.nextDouble();
        System.out.print("Enter gallons of gas used:");
        gallons=sc.nextDouble();
        double mpg=miles/gallons;
        System.out.println("MPG:"+mpg);
    }
    
}
