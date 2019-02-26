public abstract class AbstractPerson {   // you can use now abstract method

    public abstract void printName();

    protected String lastName;

    public AbstractPerson(String lastName){             // konstruktor    przypomnij sobie o co chodzi z tym THIS
        this.lastName = lastName;
    }

    public void printLastName(){
        System.out.println(lastName);
    }

}
