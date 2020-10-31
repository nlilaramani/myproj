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
public class WhileLabs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=10;
        while (count>=6){
            System.out.println(count);
            count--;
        }
        
        count=10;
        while (count<=50){
            System.out.println(count);
            count=count+10;
        }
        count=5;
        while (count>=1){
            System.out.println(count*count*count);
            count--;
        }
                
    }
    
}
