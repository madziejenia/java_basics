package Test;

public class FirstTask {
    public static void main (String[] args)
    {
        int arr[] = {2, 3, 4, 5, 6};
        int n = arr.length;
        CountingEvenOdd(arr, n);
    }
    static void CountingEvenOdd(int arr[], int arr_size)
    {
        int even_count = 0;
        int odd_count = 0;

        for(int i = 0 ; i < arr_size ; i++)                             // reads all the values in the array
        {

            if ((arr[i] & 1) == 1)
                odd_count ++ ;
            else
                even_count ++ ;
        }
        System.out.println("Even numbers = " + even_count);
        System.out.println("Odd numbers = " + odd_count);
    }
}

