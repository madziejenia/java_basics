public class Homework {

    public static void main(String[] args) {
        boolean regular = false;
        int age = 19;
        //System.out.println(age);
        if (age > 65)
            System.out.println("10%");
        else if (age < 18)
            System.out.println("25%");
        else
            System.out.println("0");
        if (regular)
            System.out.println("+5%");   // to jest zle

    }
}
//jesli wiek > 65 -> wypisz 10%