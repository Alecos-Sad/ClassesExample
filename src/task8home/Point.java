package task8home;

public class Point extends Shape {

    private final double destination;

    public Point(String name, double destination) {
        super(name);
        this.destination = destination;
    }

    public double getDestination() {
        return destination;
    }
}
