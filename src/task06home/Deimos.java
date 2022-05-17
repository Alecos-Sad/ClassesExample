package task06home;

public class Deimos extends Satellite{

    private final static double MASS = 5.36097E23;
    private final static double DIAMETER = 3474.8;

    public Deimos() {

        super("Deimos", MASS, DIAMETER);
    }

    public static double getMASS() {
        return MASS;
    }

    public static double getDIAMETER() {
        return DIAMETER;
    }

}
