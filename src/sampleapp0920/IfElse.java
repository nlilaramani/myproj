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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // if total marks otained < 60 fail
        // between 60 and 70 - D
        // 70 and 80 - C
        // 80 and 90 - B
        // 90 or above - A
        int marks=55;

        if (marks>90){
            System.out.println("Grade A");
        }else if(marks>80){
                System.out.println("Grade B");
        }else if(marks>70){  // default block
             System.out.println("Grade C");
        }else if(marks>=60){
            System.out.println("Grade D");
        }else{
            System.out.println("Fail");
        }
        
       
        System.out.println("Good Bye!");
    }
    
}
