

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) throws FileNotFoundException {
        
        int numberOfPersons;
        Scanner sc = new Scanner(System.in);
        File file = new File("family.txt");
        PrintWriter pw = new PrintWriter(file);
        
        
        System.out.print("How many people does your family have in total? :");
        numberOfPersons = sc.nextInt();   
        Person[] family = new Person[numberOfPersons]; // Array of Persons
        Initializefamily(family, sc); // Initialize all Persons on family Array
           
        for (Person person : family) {
            System.out.println(person.toString()); // will print all persons on screen
            pw.println(person.toString()); // will print all perosn on our .txt file
        }
        pw.close();
        
}   
    // Takes an array of Persons and initializes them along with their pets
    public static void Initializefamily(Person[] family, Scanner sc){
        
        for(int i=0; i<family.length; i++){
            family[i] = new Person();
            System.out.print("What's the name of person number "+(i+1)+"? :"); // Initialize person
            family[i].setName(sc.next());
            System.out.print("What's the age of person number "+(i+1)+"? :");
            family[i].setAge(sc.nextInt());       
            int numberOfPets;
            System.out.print("How many pets does person "+(i+1)+" owns? :");
            numberOfPets =sc.nextInt();
                if (numberOfPets>0){
                    for (int j=1; j<=numberOfPets; j++){ // loop to initialize pets
                    System.out.print("Whats the type of your "+(j)+" pet? :");
                    String petType = sc.next();
                    System.out.print("What is the nickname of your "+j+" pet? :");
                    String petName = sc.next();
                    family[i].addPets(petName, petType);
            }   
            } else{
                    System.out.println("No worries, you'll get a pet one day!");
                }
        }
}
            
        
    
}

