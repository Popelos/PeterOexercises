
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author popelos
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        List<String> lordList = new LinkedList();
        Set<String> lordSet = new LinkedHashSet();
        File file = new File("C:\\Users\\petroswin8\\Desktop\\Leassons\\lordOfRings.txt");
        Scanner sc = new Scanner(file);
        
        while (sc.hasNext()){ // loop to add all strings to list/set
            lordList.add(sc.next());
            lordSet.add(sc.next());
        }
        int counter= 0; // counter for strings
        for(String s:lordList){ // loot to find all words in the file
            counter++;
        }
        System.out.println("This file has "+counter+" words");
        counter =0;
        for (String s:lordSet){ // loop to find all unique words in the file
            counter++;
        }
        System.out.println("This file has "+counter+" unique words");
    }
    
}
