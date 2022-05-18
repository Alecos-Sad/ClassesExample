package task06home;

public class Fobos extends Satellite {

    private final static double MASS = 1.072E16;
    private final static double DIAMETER = 22.533;

    public Fobos() {
        super("Deimos", MASS, DIAMETER);
    }

    public static double getMASS() {

        return MASS;
    }

    public static double getDIAMETER() {

        return DIAMETER;
    }
}
