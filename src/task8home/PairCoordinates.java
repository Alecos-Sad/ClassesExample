package task8home;

public class PairCoordinates {

    double first;
    double second;
    Point point;
    Point point1;



    public PairCoordinates(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public PairCoordinates(Point point, Point point1){
        this.point = point;
        this.point1 = point1;
    }

    public PairCoordinates() {

    }


    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public void rotate(double angle){

    }

    public void scale(double valueScale){

    }
}
