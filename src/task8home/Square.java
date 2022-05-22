package task8home;


public class Square extends Shape {

    private LineSegment lineSegment;
    private double size;
    private String color;


    public Square(String name, LineSegment lineSegment) {
        super(name);
        this.size = lineSegment.getSegmentLength();
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void compress(double compressValue) {
        this.size = size - compressValue;
    }

    public void stretch(double stretchValue) {
        this.size = size + stretchValue;
    }

    public void rotate(double angle) {
        System.out.println("Square rotate on " + angle + " degrees");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getName() + "\n" + "Size: " + size + "\n" + "Color: " + color;
    }
}