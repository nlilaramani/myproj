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
public class BreakTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        while(count<=1000){
            if(count==5 || count==75 || count==85){
                
            }else{
                System.out.println(count);
            }
            count++;
            if(count>1000){
                break;
            }
        }
    }
    
}
