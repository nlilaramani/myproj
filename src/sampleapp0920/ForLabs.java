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
public class ForLabs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Calculate the average
        // 1 through 10, avg=sum/10
        int sum=0;
        for(int count=1;count<=10;count++){
            sum=sum+count;
        }
        double avg=sum/10.0;
        System.out.println("Average is : "+avg);
        for(int row=1;row<=6;row++){
            for(int column=1;column<=row;column++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        int count=0;
        while(true){
            System.out.println(count);
        }
       
        
        
    }
    
}
