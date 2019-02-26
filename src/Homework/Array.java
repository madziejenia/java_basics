package Homework;


public class Array {

    public static void main(String[] args) {
        int b = 0;

        int[] numbers = {1, 5, 3, 6, 23, 54, 3, 6, 7, 4, 4, 8, 9, 3};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0)
                b++;
        }
        System.out.println("This is the amount of numbers divisible by 3: " + b);

    }
}