import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        for (int x = 0; x < i; x++){
            if (x % 3 == 0) {
                System.out.println("skipped: " + x);
                continue;
            }

            if (x == 7) {
                System.out.println("break on " + x);
                break;
            }
            System.out.println(x);
            }
        }
    }


    // continue i break??
