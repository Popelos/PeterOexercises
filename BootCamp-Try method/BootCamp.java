
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class BootCamp {
    
    private String name;
    private LocalDate startingDate;
    private LocalDate endingDate;

    public BootCamp() {
    }

    public BootCamp(String name, LocalDate startingDate, LocalDate endingDate) {
        this.name = name;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }
    public void setStartingDate(String startingDateStr, Scanner sc) {
        boolean temp;
        LocalDate tempDate;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        do { // Data validation
            try {
                tempDate = LocalDate.parse(startingDateStr, dateFormat);
                temp = true;
            }catch(Exception e){
                System.out.println("Invalid input, date format = DD-MM-YYYY");
                System.out.print("Enter new date :");
                temp = false;
                tempDate = null;
                startingDateStr = sc.next();
            }            
        } while (temp == false);
        this.startingDate = tempDate;
       
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }
    public void setEndingDate(String endingDateStr, Scanner sc) {
         boolean temp;
        LocalDate tempDate;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        do { // Data validation
            try {
                tempDate = LocalDate.parse(endingDateStr, dateFormat);
                temp = true;
            }catch(Exception e){
                System.out.println("Invalid input, date format = DD-MM-YYYY");
                System.out.print("Enter new date :");
                temp = false;
                tempDate = null;
                endingDateStr = sc.next();
            }            
        } while (temp == false);
            this.endingDate = tempDate;
    }

    @Override
    public String toString() {
        return "BootCamp{" + "name=" + name + ", starts at" + startingDate + ", and will end at" + endingDate + '}';
    }
    
    
    
}
