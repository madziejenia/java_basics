import java.util.Scanner;

public class CircleApplication{

    public static void main(String[] args) {
        {
            Circle myCircle = new Circle();

            double CirclePI;
            double CircleRadius;
            double CircleArea;
            double CircleCircumference;
            double CircleDiameter;

            Scanner keyboard = new Scanner(System.in);
            System.out.println("What is the circle's radius?  ");
            CircleRadius = keyboard.nextDouble();
            myCircle.setRadius(CircleRadius);

            System.out.println("The area of the circle is " + myCircle.getArea());
            System.out.println("The circumference of the circle is " + myCircle.getCircumference());
            System.out.println("The diameter of the circle is " + myCircle.getDiameter());
        }
    }
}
