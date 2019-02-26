package Test;

public class FirstTask {
    public static void main (String[] args)
    {
        int num[] = {15, 15, 34, 5, 7, 8};
        int n = num.length;
        CountingEvenOdd(num, n);
    }
    static void CountingEvenOdd(int num[], int arr_size)
    {
        int even_count = 0;
        int odd_count = 0;

        for(int i = 0 ; i < arr_size ; i++)                             // reads all the values in the array
        {

            if ((num[i] & 1) == 1)
                odd_count ++ ;
            else
                even_count ++ ;
        }
        System.out.println("Even numbers = " + even_count);
        System.out.println("Odd numbers = " + odd_count);
    }
}

