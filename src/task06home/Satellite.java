package task06home;

public abstract class Satellite {

    private final String name;
    private final double mass;
    private final double diameter;

    public Satellite(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass / Earth.MASS;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getMassInEarthMass() {
        return (int) (mass / Earth.MASS);
    }

    @Override
    public String toString() {
        return "Satellite " + name + ", mass kg: " + mass + ", diameter km: " + diameter;
    }
}
