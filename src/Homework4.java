import java.util.Scanner;

public class Homework4{

    // Write a Java program that reads a number and display the square, cube and fourth power.

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = in.nextInt();

        System.out.println("Squared: ");
        System.out.println(number * number);

        System.out.println("Cubed: ");
        System.out.println(number * number * number);

        System.out.println("Fourth power: ");
        System.out.println(Math.pow(number, 4));
    }
}
