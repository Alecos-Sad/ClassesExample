package task06home;

public class Moon extends Satellite {

    private final static double MASS = 1.36097E23;
    private final static double DIAMETER = 3474.8;

    public Moon() {

        super("Moon", MASS, DIAMETER);
    }

    public static double getMASS() {
        return MASS;
    }

    public static double getDIAMETER() {
        return DIAMETER;
    }

}
