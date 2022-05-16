package task06home;

public abstract class Planet {

    private final String name;
    //TODO добавить массив лун
    private final int diameter;
    private final double mass;
    private boolean circles;

    public Planet(String name, int diameter, double mass, boolean circles) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.circles = circles;
    }

    public String getName() {
        return name;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public boolean isCircles() {
        return circles;
    }

    public int getMassInEarthMass() {
        return (int) (mass / Earth.MASS);
    }

    @Override
    public String toString() {
        return "Planet name: " + name + ", diameter km: " + diameter + ", mass kg: " + mass + ", circles: " +
                (circles ? "Yes" : "No");
    }
}
