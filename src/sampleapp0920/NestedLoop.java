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
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=10; // Row
        int j=0; // Columns
        while(i<=3){ // Loop rows from 0-3 (4 times) // outer loop
            j=0;
            while (j<=i){ // Column loop = row number, inner loop
                if(i%2==0){
                    System.out.print("* ");
                }else{
                    System.out.print("# ");
                }
                j++;
            }
            System.out.println(""); // Start a new line
            i++;
        }
                
    }
    
}
