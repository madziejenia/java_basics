import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 3:
                System.out.println("hello");
                break;
            case 7:
                System.out.println("case 7");
                break;

                default:
                    System.out.println("something default");   // o co kaman z tym default?
        }

        if (i == 3) {
            System.out.println("same as case 3");
        } else if (i == 7) {
            System.out.println("case 7");
        }
        System.out.println("end");

    }
}
// switch cases???
// scoop ??
