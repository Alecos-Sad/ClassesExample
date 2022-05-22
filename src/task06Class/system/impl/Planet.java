package task06Class.system.impl;

import task06Class.system.SpaceObject;

public class Planet extends SpaceObject {

    private Satellite[] satellites;

    public Planet(String name) {
        super(name);
    }

    public Planet(String name, Satellite[] satellites) {
        super(name);
        this.satellites = satellites;
    }

    public Satellite[] getSatellites() {
        return satellites;
    }

    public void setSatellites(Satellite[] satellites) {
        this.satellites = satellites;
    }

    public void addSatellite(Satellite satellite) {
        if (satellite != null) {
            if (satellites == null) {
                satellites = new Satellite[1];
                satellites[0] = satellite;
            } else {
                Satellite[] newArray = new Satellite[satellites.length + 1];
                System.arraycopy(satellites, 0, newArray, 0, satellites.length);
                newArray[satellites.length] = satellite;
                satellites = newArray;
            }
        } else {
            System.out.println("Planet is NULL!");
        }
    }

    @Override
    public String toString() {
        StringBuilder satelliteString = new StringBuilder();
        if (satellites != null && satellites.length > 0) {
            for (Satellite satellite : satellites) {
                satelliteString.append(satellite.getName()).append("\n");
            }
            satelliteString.setLength(satelliteString.length() - 1);
        } else {
            satelliteString.append("\t\tWhere is NO satellites");
        }
        return "Planet: " + getName() + "\n" + "Satellites: " + satelliteString;
    }
}
