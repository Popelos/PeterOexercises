/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import interfaces.Advisable;

/**
 *
 * @author popelos
 */
public class Teacher extends Employ implements Advisable {

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public void teach() {
    }

    @Override
    public void giveAdvise() {

    }
    
    @Override
    public void work(){
        System.out.println("Starts teaching");
    }
    

}
