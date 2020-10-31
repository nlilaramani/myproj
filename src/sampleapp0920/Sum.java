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
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=1;
        int sum=0;
        while (count<=10000){
            sum=sum+count;
            count=count+2;//1 3 5 7 
        }
        System.out.println("SUM="+sum);
    }
}
