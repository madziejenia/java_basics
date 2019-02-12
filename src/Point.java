public class Point {   // point used as a reference data types

    public int x;   // modifiers, variable_type variable_name = value;
    // public, private, protected to modifiers
    public int y;

    public Point(){

    }

    public Point(int xCoordinate, int yCoordinate) {
        x = xCoordinate;
        y = yCoordinate;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void move (int newX, int newY) {
        x = newX;
        y = newY;
    }
}
