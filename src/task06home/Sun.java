package task06home;

public class Sun extends Star {

    private static final int TEMPERATURE = 5505;
    private static final double MASS = 1.98892E30;
    private static final double DIAMETER = 1392700;
    private static final char CLASSIFICATION = 'G';
    private static final String COLOR = "Yellow";

    public Sun() {
        super("SUN", TEMPERATURE, MASS, DIAMETER, CLASSIFICATION, COLOR);
    }
}
