/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sximata;

import java.util.ArrayList;
import java.util.List;
import myPackage.Circle;
import myPackage.Shape;
import myPackage.Square;
import myPackage.Triangle;

/**
 *
 * @author popelos
 */
public class Sximata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle t1 = new Triangle("Yellow",Size.LARGE ,3,4,5);
        Square   s1 = new Square  ("Blue"  ,Size.MEDIUM,4);
        Circle   c1 = new Circle  ("Green" ,Size.SMALL ,5);
        List<Shape> sximata = new ArrayList();
        
        sximata.add(t1);
        sximata.add(s1);
        sximata.add(c1);

        for(Shape sxima:sximata){ // loop to print all Shapes
           sxima.printShape(); }
                                      
        findLargestShape(sximata);
        
        Square   s2 = new Square  ("Orange"  ,Size.MEDIUM,5);
        Square   s3 = new Square  ("Red"  ,Size.LARGE,6);
        sximata.add(s2);
        sximata.add(s3);
        
        findLargestSquare(sximata);
}
    
    public static void findLargestShape(List<Shape> sximata){
        float maxArea=0;
        float maxPerimeter=0;
        
            for(Shape sxima:sximata){ // loop to find largest perimeter/area
                       
                // finds the shape with the largest perimeter
                if(maxPerimeter<sxima.getPerimeter()){  
                   maxPerimeter = sxima.getPerimeter();               
                }
                // finds the shape with the largest area
                if(maxArea<sxima.getArea()){
                   maxArea=sxima.getArea();
                }
            }          
            for(Shape sxima:sximata){ // loot to pritn the shape with the largest perimeter
                if(maxPerimeter==sxima.getPerimeter()){
                System.out.print("The shape witht the largest perimeter is a :");                
                sxima.printShape();
                }
            } 
} 
    public static void findLargestSquare(List<Shape> sximata){
        float maxPerimeter=0;
        
        for (Shape sxima:sximata){ // loop to find the square with largest perimeter
            if ("Square".equals(sxima.getShape())){ // checks if shape is square
                if(maxPerimeter<sxima.getPerimeter()){  
                  maxPerimeter = sxima.getPerimeter();               
                }
            }
        }
        for (Shape sxima:sximata){ //loop to print the largest square
            if(maxPerimeter==sxima.getPerimeter()){
                System.out.print("The Square with the largest perimeter is a:");
                    sxima.printShape();
                }                    
        }
    }
}
