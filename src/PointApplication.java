public class PointApplication {

    public static void main(String[] args) {

        Point point1 = new Point(1, 1);   // new to constructor, wszystko poza primitive data types to reference data types
        Point point2 = new Point(10, 3);

        Rectangle rectangle = new Rectangle(point1, point2);

        int area = rectangle.calculateArea();

        System.out.println(area);


        // int x = point1.getX();

        // System.out.println(point1.x);

        //point1.move ( 3,  1);   // newX i newY to hint z programu wpisujesz tylko 3 i 1 i to sie podstawi
        // x = point1.getX();

       // point1.x = 1;
        //point1.y = 1;

       // System.out.println(point1.x);
    }
}
