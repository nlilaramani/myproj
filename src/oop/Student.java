/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author itexps
 */
public class Student {
    int id;
    String name;
    int age;
    String address;
    String[] courses;
    boolean isEnrolled;
    // Default Public Constructor
    /*public Student(){
        System.out.println("Constructing Student Object...");
    }*/
    
    public Student(int sId,String sname,String saddress,int sage){
        if(sId>0){
            id=sId;
        }
        name=sname;
        address=saddress;
        age=sage;
    }
    
    public void getInfo(){
        System.out.println("***Student Info*****");
        System.out.println("Id:"+id+",Name:"+name+",Address:"+address);
        System.out.println("***End Student Info*****");
    }
    
}
