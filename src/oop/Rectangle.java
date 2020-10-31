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
public class Rectangle implements Shape{
    private double length;
    private double width;
    public Rectangle(double l,double w){
        length=l;
        width=w;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.....");
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(length+width);
    }
}
