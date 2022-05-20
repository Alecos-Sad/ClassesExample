package task8home;

public class Line extends PairCoordinates{

    private PairCoordinates lines;

    public Line(double x1, double y1, double x2, double y2) {
        this.lines = new PairCoordinates(new Point(x1,y1), new Point(x2,y2));
    }

   // public double lenght(){

    }//Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//}
