package task06home;

public class Deimos extends Satellite {

    private final static double MASS = 1.48E15;
    private final static double DIAMETER = 12.4;

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
