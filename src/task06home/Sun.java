package task06home;

public class Sun extends Star {

    public Sun(int temperature, double mass, double diameter, char classification, String color) {
        this("Sun", temperature, mass, diameter, classification, color);
    }

    private Sun(String name, int temperature, double mass, double diameter, char classification, String color) {
        super(name, temperature, mass, diameter, classification, color);
    }


}
