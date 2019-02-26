package Homework;

public class Vehicle {
    public static void main(String[] args) {

    }
    String make;
    boolean engineState = false;

    void startEngine(){                                         // this method tests to see whether the engine is already running - engineState == true
        if(engineState = true)
            System.out.println("The engine is already on.");
        else {
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
}
