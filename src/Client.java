public class Client extends Person {    // klasa zawiera klase Person, Client rozszerza klase Person


    public Client(String firstName, String lastName){
        super(firstName, lastName);

    }

    public Client(String firstName, String lastName, int age){
        super(firstName, lastName, age);
    }

    //String firstName;
    // String lastName;
    //int age;

    public int getDiscount(){
        if (age > 60) {
            return 15;
        } else if (age <18){
            return 10;
        }
        return 5;
    }

    @Override   // annotation - wszystko co zaczyna sie od @ to annotation
    public void printFullName() {
        System.out.println("running from Client");
        System.out.println("Discout: " + this.getDiscount());
        super.printFullName();
    }
}
