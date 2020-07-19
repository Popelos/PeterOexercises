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
public class Square extends Shape{
    
    protected int side;
    public final String square = "Square";

    public Square() {
    }
    public Square(int side) {
        this.side = side;
    }

    public Square(String color, Size size, int side) {
        super(color,size);
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public String getShape() {
        return square;
    }
    
    
    
    
    @Override
    public float getPerimeter(){
        float  perimeter = 4*this.side;
        return perimeter;
        
    }
    @Override
    public float getArea(){
        float  area = (float)Math.pow(this.side,2);
        return area;
        
    }
    @Override
    public void printShape(){
        String printOutcome = String.format("Printing a %S %s %s",this.size,this.color,this.square);
        System.out.println(printOutcome);
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
