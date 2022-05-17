package task06home;

public class Earth extends Planet {

    private static final int DIAMETER = 12742;
    public static final double MASS = 5.9742E24;


    public Earth() {
        super("Earth", DIAMETER, MASS, false, new Satellite[]{new Moon()});
    }

    public static int getDIAMETER() {
        return DIAMETER;
    }

    public static double getMASS() {
        return MASS;
    }

}


