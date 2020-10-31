/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class Circle implements Shape{
    // instance variables, gets initialized to default values
    private int centerX=0; // package private access
    private int centerY=0; // To store Y value of center=0
    private double radius=5.0; // =0.0
    // Encapsulation
    // Capsule -> protects medicine, 
    // Encapsulation 
    public Circle(){
        
    }
    public Circle(double r){
        radius=r;
    }
    
    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
   
    
    public double getArea(){
        double area=3.14*radius*radius;
        return area;
    }
    
    //Add a method for calculating Circumference of a circle
    // 2*Pi*radius
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c;// creating variable of type Circle
        c=new Circle(); // Creates an object of type circle and assigns to variable c
        System.out.println("Circle's Radius:"+c.radius);
        c.radius=-10.0;
        System.out.println("Circle's Radius:"+c.radius);
        int x;
        //x=10;
        //System.out.println("Value of x:"+x);
        
        
        
        /*c.centerX=5;
        c.centerY=5;
        c.radius=10.0;
        Circle c1; // Declaration of varibale of type circle
        c1=new Circle();
        c1.centerX=10;
        c1.centerY=10;
        c1.radius=25.2;
        System.out.println("Circle c");
        System.out.println("c.X:"+c.centerX);
        System.out.println("c.Y:"+c.centerY);
        System.out.println("c.Radius:"+c.radius);
        System.out.println("Area:"+c.getArea());
        System.out.println("Circle c1");
        System.out.println("c1.X:"+c1.centerX);
        System.out.println("c1.Y:"+c1.centerY);
        System.out.println("c1.Radius:"+c1.radius);
        System.out.println("Area:"+c1.getArea());
        double carea=c.getArea();
        System.out.println("Area of circle c is:"+carea);
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println("Char:"+ch);
        */
        
                
        
        
                
        
        
    }

    @Override
    public void draw() {
        System.out.println("Drwaing Circle...");
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*3.14*radius;
    }

    
}
