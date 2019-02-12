import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        System.out.print("Enter temperature in Celsius: ");

        Scanner in = new Scanner(System.in);

        float celsius = in.nextFloat();
        float fahrenheit = (celsius * 9 / 5 + 32);

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
