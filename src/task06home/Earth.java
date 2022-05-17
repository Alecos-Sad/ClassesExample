package task06home;

import java.util.Arrays;

public class Earth extends Planet {

    private static final int DIAMETER = 12742;
    public static final double MASS = 5.9742E24;
    private Satellite[] satellites;

    public Earth() {
        super("Earth", DIAMETER, MASS, false);
        this.satellites = new Satellite[] {new Moon()};

    }

    public static int getDIAMETER() {
        return DIAMETER;
    }

    public static double getMASS() {
        return MASS;
    }

    @Override
    public String toString() {
        return "Earth: " + Arrays.toString(satellites);
    }
}


