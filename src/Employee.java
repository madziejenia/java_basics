public class Employee extends Person {


    public Employee(String firstName, String lastName) {    // alt + enter i wybierasz konstuktora
        super(firstName, lastName);
    }

    public void printAge(){
        System.out.println("Age: " + age);
    }
}
