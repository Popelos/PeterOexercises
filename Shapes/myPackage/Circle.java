/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import sximata.Size;

/**
 *
 * @author popelos
 */
public class Circle extends Shape{
    
    protected int radius;
    final float p=3.14f;
    public final String circle = "Circle";

    public Circle() {
    }
    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(String color, Size size, int radius) {
        super(color,size);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public String getShape() {
      return circle;
    }
    @Override
    public float getPerimeter(){
        float  circumference = p*(2*this.radius);
        return circumference;
    }
 
    @Override
    public float getArea(){
        float  area =(float) Math.pow((p*this.radius), 2);
        return area;
    }
    @Override
    public void printShape(){
        String printOutcome = String.format("Printing a %s %s %s",this.size,this.color,this.circle);
        System.out.println(printOutcome);
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
