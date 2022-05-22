package task06Class.system.impl;

import task06Class.system.SpaceObject;

public class Sun extends SpaceObject {

    private SpaceObject[] planets;

    public Sun(String name) {
        super(name);
    }

    public Sun(String name, SpaceObject[] planets) {
        super(name);
        this.planets = planets;
    }

    public SpaceObject[] getPlanets() {
        return planets;
    }

    public void setPlanets(SpaceObject[] planets) {
        this.planets = planets;
    }

    public void addPlanet(SpaceObject planet) {
        if (planet != null) {
            if (planets == null) {
                planets = new SpaceObject[1];
                planets[0] = planet;
            } else {
                SpaceObject[] newArray = new SpaceObject[planets.length + 1];
                System.arraycopy(planets, 0, newArray, 0, planets.length);
                newArray[planets.length] = planet;
                planets = newArray;
            }
        } else {
            System.out.println("Planet is NULL!");
        }
    }

    @Override
    public String toString() {
        StringBuilder planetString = new StringBuilder();
        if (planets != null && planets.length > 0) {
            for (SpaceObject planet : planets) {
                planetString.append("\t").append(planet).append("\n");
            }
            planetString.setLength(planetString.length() - 1);
        }

        return "Star: " + getName() + "\n" + planetString;
    }
}
