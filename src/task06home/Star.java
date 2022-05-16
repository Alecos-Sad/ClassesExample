package task06home;

public abstract class Star {

    private final String name;
    private final int temperature;
    private final double mass;
    private final double diameter;
    private final char classification;
    private final String color;


    public Star(String name, int temperature, double mass, double diameter, char classification, String color) {
        this.name = name;
        this.temperature = temperature;
        this.mass = mass;
        this.diameter = diameter;
        this.classification = classification;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public char getClassification() {
        return classification;
    }

    public String getColor() {
        return color;
    }

    public int getMassInEarthMass() {
        return (int) (mass / Earth.MASS);
    }

    @Override
    public String toString() {
        return "Star name: " + name + ", temperature C: " + temperature + ", mass kg: " + mass + ", diameter km: "
                + diameter + ", classification: " + classification + ", color: " + color;
    }
}
