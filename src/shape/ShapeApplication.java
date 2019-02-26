package shape;


public class ShapeApplication {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4);
        printArea(circle);
        printArea(rectangle);

    }

    static void printArea(ShapeInterface shape){
        System.out.println(shape.calculateArea());

    }
}


// Java moze extend jedna klase ale moze implementowac kilka interfejsow, wpisujesz je po przecinku (te interfejsy)