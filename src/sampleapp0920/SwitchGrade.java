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
public class SwitchGrade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char grade='W';
        int age=20;
        switch(grade){
            case 'A':
            case 'B':
            case 'C': 
            case 'D': System.out.println("Pass");
                    break;
            case 'W': System.out.println("Withdrew");
                    break;
            
            case 'I': System.out.println("Incomplete");
                    break;
            
            default: System.out.println("Failed");
        }

        if(grade=='A' || grade=='B' || grade=='C' || grade=='D'){
            System.out.println("Pass");
        }
    }
    
}
