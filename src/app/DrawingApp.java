/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import oop.Circle;
import oop.Shape;
import oop.Rectangle;

/**
 *
 * @author itexps
 */
public class DrawingApp {
    
    public static void drawAShape(Shape s){
        s.draw();
        System.out.println("Area="+s.area());
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c;
        c=new Circle(); // radius = 5.0
        System.out.println("Radius of Circle:"+c.getRadius());
        c.setRadius(100.0);
        System.out.println("Radius of Circle:"+c.getRadius());
        c.setCenterX(5);
        c.setCenterY(10);
        Circle c1=new Circle(10.0);
        drawAShape(c);
        Rectangle r=new Rectangle(10,10);
        drawAShape(r);
        Shape s;
        s=c;
        s=r;
        
                
        
        
    }
}
