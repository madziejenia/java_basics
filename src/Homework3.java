import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        n = s.nextInt();
        if (n % 23 == 0)
        {
            System.out.println(n+ " is divisible by 23");
        }
        else
            {
            System.out.println(n+ " is not divisible by 23");
        }
        }
    }
}
