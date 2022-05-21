package task8home;

import java.util.Arrays;

public class Task08Main {

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 2);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 2);

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);
        Line line3 = new Line(p1, p3);
        Line line4 = new Line(p2, p4);

        Line[] lines = new Line[]{line1, line2, line3, line4};

        Square square = new Square(lines);





        System.out.println(line1.getPoint1().getX() + " " + line1.getPoint1().getY());
        System.out.println(line2.getPoint2().getX() + " " + line2.getPoint2().getY());

        System.out.println(line3.length());




    }
}
