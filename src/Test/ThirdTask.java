package Test;
// Write a program that counts number of existing objects of a given type.

public class ThirdTask {
    static int count = 0;
    ThirdTask()
    {
        count++;
    }

    public static void main(String[] args) {
        ThirdTask obj1 = new ThirdTask();
        ThirdTask obj2 = new ThirdTask();
        ThirdTask obj3 = new ThirdTask();
        ThirdTask obj4 = new ThirdTask();
        ThirdTask obj5 = new ThirdTask();
        System.out.println("Number of created objects: " + count);

    }
}
