package task8home;

public class Point extends PairCoordinates {

    private PairCoordinates coordinates;

    public Point(double first, double second) {
        super(first, second);
        this.coordinates = new PairCoordinates(first, second);
    }

    public double getX() {
        return coordinates.getFirst();
    }

    public double getY() {
        return coordinates.getSecond();
    }

    @Override
    public void scale(double valueScale) {
        double x = coordinates.getFirst();
        double y = coordinates.getSecond();

        double scaleX = x * valueScale;
        double scaleY = y + valueScale;

        coordinates = new PairCoordinates(scaleX, scaleY);
    }

    @Override
    public void rotate(double angle) {
        double x = coordinates.getFirst();
        double y = coordinates.getSecond();

        double rotateX = x * Math.cos(angle) - y * Math.sin(angle);
        double rotateY = x * Math.sin(angle) + y * Math.cos(angle);

        coordinates = new PairCoordinates(rotateX, rotateY);
    }

}
