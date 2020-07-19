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
public class Triangle extends Shape{
    
    protected int base,side2,hight;
    public final String trianlge = "Triangle";

    public Triangle() {
        
    }
    public Triangle(String color, Size size, int base, int side2, int hight) {
        super(color,size);
        this.base = base;
        this.side2 = side2;
        this.hight = hight;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getSide2() {
        return side2;
    }
    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getHight() {
        return hight;
    }
    public void setHight(int hight) {
        this.hight = hight;
    }
    
    @Override
    public String getShape() {
       return trianlge;
    }
    @Override
    public float getPerimeter(){
        float  perimeter = this.base+this.side2+this.hight;
        return perimeter;
    }
    @Override
    public float getArea(){
        float  area = (this.base*this.hight)/2;
        return area;        
    }
    @Override
    public void printShape(){
       String printOutcome = String.format("Printing a %s %s %s",this.size,this.color,this.trianlge);
        System.out.println(printOutcome);
    }

    @Override
    public String toString() {
        return "Triangle{" + "base=" + base + ", side2=" + side2 + ", hight=" + hight + '}';
    }
    
}
