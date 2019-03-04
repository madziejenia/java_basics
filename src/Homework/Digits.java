package Homework;

public class Digits {

    static int NumberOfDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + NumberOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 845739604;
        System.out.println("Number of digits: " + NumberOfDigits(n));
    }
}
