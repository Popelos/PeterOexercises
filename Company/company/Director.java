/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import interfaces.Advisable;
import interfaces.Driving;

/**
 *
 * @author popelos
 */
public class Director extends Employ implements Driving,Advisable{

    public Director(String name, double salary) {
        super(name, salary);
    }
    
    
    public void guide(){
        
    }
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void giveAdvise() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void work(){
        System.out.println("Starts instructing");
    }
}
