public class ReverseArray {

    public void printReversed(int[] arr) {
        int n = arr.length;



        // n steps
        for (int i = n - 1; i >= 0; i--) {
            // 1st step
            System.out.println(arr[i]);
            //2nd step
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int[] alternative = new int[]{1, 2, 3};

        // for each
        for (int someVar : numbers) {
            System.out.println(someVar);
            if (someVar == 1) {
                break;
            }

        }


        ReverseArray reverseArray = new ReverseArray();
        reverseArray.printReversed(new int[]{1, 2, 3});

    }
}

// poprawic to!!!