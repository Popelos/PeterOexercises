
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BootCamp> bootCamps = new ArrayList();
         
        for (int i=0; i<3;i++){ // inialize 3 bootcamps
            InitializeBootCamps(bootCamps, sc);
        }
        
        CheckAvailability(bootCamps, sc); 
        
        
    }
    public static void InitializeBootCamps(List<BootCamp> BCList, Scanner sc){
        BootCamp bc = new BootCamp();
        
        System.out.print("Enter the name of the BootCamp :");
        bc.setName(sc.next());
        System.out.print("Enter the starting date (DD-MM-YYYY:");
        bc.setStartingDate(sc.next(), sc);
        System.out.print("Enter the ending date (DD-MM-YYYY:");
        bc.setEndingDate(sc.next(),sc);
        BCList.add(bc);
    }
    
    public static void CheckAvailability(List<BootCamp> BCList,Scanner sc){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.print("Enter date to check availability (DD-MM-YYYY):");  
        LocalDate date = LocalDate.parse(sc.next(),dateFormat);
            
         for(BootCamp bc : BCList){
           int availableBC=BCList.size();
           LocalDate tempEndingDate = bc.getEndingDate();
           LocalDate tempStartingDate = bc.getStartingDate();
        
           if(date.isAfter(tempStartingDate)&&date.isBefore(tempEndingDate)){
               System.out.println(bc.toString());
              
           } else{
            availableBC--;
           }
          if (availableBC==0)
                System.out.println("Sorry no bootcamp available "+date);
    }
        
    }
}
