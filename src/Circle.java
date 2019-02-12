public class Circle {

    final double PI = 3.14159;
    double radius;
    double area;
    double circumference;
    double diameter;

    public Circle (double r, double a, double c, double d) {
        radius = r;
        area = a;
        circumference = c;
        diameter = d;
    }

    public Circle() {
        radius = 3;
        area = 10;
        circumference = 30;
        diameter = 15;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area = PI * radius * radius;
    }

    public double getCircumference() {
        return circumference = 2 * PI * radius;
    }

    public double getDiameter() {
        return diameter = radius * 2;
    }

    public double getPI() {
        return PI;
    }
}

