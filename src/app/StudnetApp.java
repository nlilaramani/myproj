/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import oop.Student;

/**
 *
 * @author itexps
 */
public class StudnetApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=0;
        Student s=new Student(1,"Tom","Streamwood",34); // Enforce valid state
        s.getInfo();
        //s.setAddress("Elgin");
        Student s1=new Student(2,"Robert","Schaumburg",26);
        s1.getInfo();
        
        int x1=10,y1=20;
        int r=x1+y1; // + -> Addition, Sum
        String st1="ABC", st2="XYZ";
        String st=st1+st2; // + -> Concatenation
        
    }
    
}
