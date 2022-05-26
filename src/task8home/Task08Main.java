package task8home;

public class Task08Main {

    public static void main(String[] args) {

        Point point1 = new Point("Point1", 5);
        Point point2 = new Point("Point2", 19);

        Square square = new Square("Square", new LineSegment("LineSegment", point1, point2));

        square.setSize(40);
        square.compress(2);
        square.stretch(9);
        square.setColor("Red");

        System.out.println(square);
        square.rotate(56);
    }
}
