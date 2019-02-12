import java.util.Scanner;

public class Lesson5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        // double sum = 0;
        // for (int i = 0; i < n; i++) {
        //   sum = sum + numbers[i];
        //}
        //double avg = sum / n;
        // System.out.println(avg);

        double avg = average(numbers);
        System.out.println(avg);
    }

        static double average ( int[] numbers){
            double sum = 0;
            double n = numbers.length;
            for (int i = 0; i < n; i++) {
                sum = sum + numbers[i];
            }
            double avg = sum / n;
            return avg;
        }
    }


// musisz wpisac na dole 10 wartosci i wtedy policzy srednia
// metoda od uzytkownika