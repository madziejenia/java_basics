public class HelloWorld {

    public static void main(String[] args) {
        int age = 20;
        System.out.println(age++);

        char characterC = 'C';
        char character = '\u0214';
        //
        System.out.println(character);
        boolean inWroclaw = false;
        if (inWroclaw) {
            System.out.println("InWroclaw");
        } else {
            System.out.println("Opole");
        }
        if (inWroclaw)
            System.out.println("1");
        else
            System.out.println("2");
            System.out.println("3");

            if (age>20)
                System.out.println("25");
            else
                System.out.print("30");

        System.out.print(age);

        System.out.println("HelloWorld");
    }
}

