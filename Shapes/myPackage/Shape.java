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
public class Shape {
    
    protected String color;
    protected Size size;
    public final String shape = "shape";

    public Shape() {
    }
    public Shape(String color, Size size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    
    public float getPerimeter(){
        float perimeter=0;
        return perimeter;
    }
    public float getArea(){
        float  area=0;
        return area;
    }

    public String getShape() {
        return shape;
    }
   
    
    
    public void printShape(){
        String printOutcome = String.format("Printing a %s %s",this.size,this.color);
        System.out.println(printOutcome);
        }
    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", size=" + size + '}';
    }
    
}

