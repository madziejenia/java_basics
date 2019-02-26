public class PersonApplication {

    public static void main(String[] args) {

        //Person john = new Person("John", "Smith", 25);                // Person - nazwa klasy
        //john.firstName = "John";
        //john.lastName = "Smith";

        AbstractPerson abstractPerson1 = new Person("Paul", "Smith");
        abstractPerson1.printName();



        Person p1 = new Client("Stefan", "Burns", 32);  // polimorfizm
        Person p2 = new Employee("employee", "surname");

        p2.printFullName("Hi!");
        p1.printFullName(); // p1 => varibale
        printFullName(p1);
        Client c1 = (Client) p2;  // ClassCastException
        printFullName(c1);

        //printFullName(john);
        // Person anotherJohn = john;
        //printFullName(anotherJohn);

       Client client1 = new Client("Steven",  "Grey", 28);
       Person person1 = client1;
    }

    private static void printFullName(Person p){
        System.out.println("printing person information");
        p.printFullName();
    }
    private static void printFullName(Client client){
        System.out.println("printing client information");
        client.printFullName();
    }

    //private static void printFullName (Person p){
       // p.printFullName();
    }




// any class can extends another class