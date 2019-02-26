import people.Address;

public class Person  extends AbstractPerson {

    // public
    // protected odostepnia dane np w drugiej klasie, allows access to any children
    // default (abscence of access modifier)
    // private - tylko w danej klasie

    //private final String firstName;
    //protected int age;
    // private Address address;


    String firstName = null;
    String lastName = null;
    int age;

    static int count = 0;

    static {
        System.out.println("static variables initialization" + count);

    }

    {
        System.out.println("instance variable initialization");
        firstName = "empty";
        age = -1;
    }


    public Person (String firstName, String lastName){
        super(lastName);                                // o co chodzi z tym SUPER?
    count++;
      System.out.println("2 parameter-constructor");
      this.firstName = firstName;
      this.lastName = lastName;

    }

    public Person(String firstName, String lastName, int age){
       this(firstName, lastName);
       System.out.println("3 parameter-constructor");
       this.age = age;

    }
    @Override
    public void printName(){
        System.out.println(firstName);
    }

    public void printFullName(){
        System.out.println("running from Person");
        System.out.println(firstName + " " + lastName);

    }
    public void printFullName(String greeting){
        System.out.println(greeting + " ");
        printFullName();

        }

    public void setAge (int age){
        this.age = age;

    }


    @Override
    public boolean equals (Object obj){
        // 1. reflexive: x.equals(x) => should return true
        // 2. transitive: x,y,z; if x.equals(y) and y.equals(z)  => x.equals(z)
        // 3. symmetric: if x.equals(y) then y.equals(x)
        // 4. consistent:
        // 5. null-safe


        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

            Class thisClass = getClass();
            Class thatClass = obj.getClass();

            if (!thisClass.equals(thatClass)){
                return false;
            }

            if (!(obj instanceof Person)){                          // (!(   => jesli to nie prawda
                return false;
        }
        Person thatPerson = (Person) obj;
        if(thatPerson.firstName.equals(this.firstName)
        && thatPerson.lastName.equals(this.lastName)
                && thatPerson.age == this.age){
            return true;
        }

        return false;
    }
}

// super w metodach nie musi byc na pierwszym miejscu, musi byc w konstruktorze
// final for classses - prevent this class to be inherited by another class, nie mozna uzyc final do konstruktora