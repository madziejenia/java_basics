package shape;

public interface ShapeInterface {   // can declare only abstract method

    double PI = 3.14;
    double calculateArea ();

    default void printPi(){
        System.out.println(PI);
    }



    //double calculateArea();    // by default it is publuc

}


// kazda zmienna jest z zalozenia static