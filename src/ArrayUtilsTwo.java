public class ArrayUtilsTwo {

    public static void sort(int[] arr){

        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }

        // external loop
        for (int i = 0; i < arr.length; i++) {
            int min = i;

            // internal loop

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {     // jesli index min = i
                    min = j;

                }
            }
            if (min != i) {   //jesli min nie jest rowne i to musi byc swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }

        }

        System.out.println("After sort:");
        for (int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }
    }
}
