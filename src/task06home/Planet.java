package task06home;

import java.util.Arrays;

public abstract class Planet {

    private final String name;
    private final int diameter;
    private final double mass;
    private boolean circles;
    private Satellite[] satellites;

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

    public Satellite[] getSatellites() {
        return satellites;
    }

    public void setSatellites(Satellite[] satellites) {
        this.satellites = satellites;
    }

    public int getMassInEarthMass() {
        return (int) (mass / Earth.MASS);
    }

    @Override
    public String toString() {
        return "Planet name: " + name + ", diameter km: " + diameter + ", mass kg: " + mass + ", circles: " +
                (circles ? "Yes" : "No") + ", Satellites: " + Arrays.toString(satellites);
    }


}
