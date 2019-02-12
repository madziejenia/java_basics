import java.util.Scanner;

public class Factorial {

    // Create program to calculate factorial of entered number

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int i, fact = 1;

        for(i = 1; i <= number; i++){
            fact = fact * i;
        }

        System.out.println("Factorial of " + number + " is: " + fact);
    }

}
