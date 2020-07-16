import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author popelos
 */
public class Person {
    
    private String name;
    private int age;
    private ArrayList<Pets>pets;

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.pets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setPets(ArrayList<Pets> pets) {
        this.pets = pets;
    }
    public List<Pets> getPets() {
        return pets;
    }
    
    public void addPets(String petName, String petType){
        Pets e = new Pets(petName,petType);
        this.pets.add(e);
            
        }

    @Override
    public String toString() {
        String result = "Person{" + "name= " + name + ", age= " + age + ", pets= " + pets + '}';
        return result;
    }
            
 }
