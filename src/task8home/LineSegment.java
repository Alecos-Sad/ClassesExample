package task8home;

public class LineSegment extends Shape {

    private final Point point1;
    private final Point point2;

    public LineSegment(String name, Point point1, Point point2) {
        super(name);
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getSegmentLength() {
        return Math.sqrt(point2.getDestination() - point1.getDestination());
    }
}
