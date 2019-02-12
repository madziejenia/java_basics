
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char a = 'a';
        char A = 65;
        char someChar = '\u00c7';
        System.out.println(a);
        System.out.println(A);
        System.out.println(someChar);

        int difference = a - A;
        System.out.println(difference);

        byte b = 10;
        Byte bClass = null;

        byte b2 = bClass;

        byte b1 = Byte.parseByte("14");

        Integer integer = 10;
        String binaryString = Integer.toString(10, 3);


        int comparisonResult = bClass.compareTo((byte) 12);

        System.out.println(comparisonResult);
    }
}


       // int[] myArray = new int[] {1,2,3,7, 10};

       // int [] i = Arrays.copyOf(myArray, 3);
        //System.out.println(Arrays.toString(i));



