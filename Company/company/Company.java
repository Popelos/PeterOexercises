/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Nick", 900);
        Teacher t2 = new Teacher("John", 900);
        Receptionist r1 = new Receptionist("George", 900);
        Director d1 = new Director("Jim", 1000);
        Director d2 = new Director("Tyler", 1000);
        List<Employ> employs = new ArrayList();
        

        employs.add(t1);
        employs.add(t2);
        employs.add(r1);
        employs.add(d1);
        employs.add(d2);

        for (Employ e : employs) {
            e.work();
        }
        List<Employ> drivers = new ArrayList(); // Array for drivers
        List<Employ> advisors = new ArrayList(); // Array for advisors
        
        for (Employ e : employs) {
            if (e instanceof Teacher) { // Teachers can advise
                advisors.add(e);
            } else if (e instanceof Director) { //Directors can drive/advise
                drivers.add(e);
                advisors.add(e);
            } else { // Will add the receptionist (that can drive)
                drivers.add(e);
            }
        }
    }

}
