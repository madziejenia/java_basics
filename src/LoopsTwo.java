import java.util.Scanner;

public class LoopsTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for (int x = 0; x < i; x++){
            if (x % 3 == 0) {
                System.out.println(x);
            }
        }
    }
}
// i to liczba ktora wpisujesz na dole - ta na zielono
// scanner ??