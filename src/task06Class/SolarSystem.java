package task06Class;

import task06Class.system.SpaceObject;
import task06Class.system.impl.Planet;
import task06Class.system.impl.Satellite;
import task06Class.system.impl.Sun;

public class SolarSystem {

    private SpaceObject[] suns;

    public SolarSystem() {
    }

    public SolarSystem(SpaceObject[] spaceObjects) {
        this.suns = spaceObjects;
    }

    public SpaceObject[] getSuns() {
        return suns;
    }

    public void setSuns(SpaceObject[] suns) {
        this.suns = suns;
    }

    public void countPlanets() {
        int count = 0;
        for (SpaceObject object : suns) {
            Sun sun = (Sun) object;
            SpaceObject[] planets = sun.getPlanets();
            count += planets.length;
        }
        System.out.println("Numbers of Planet is: " + count);
    }

    public void showSunName() {
        for (SpaceObject object : suns) {
            System.out.println("Star: " + object.getName());
        }
    }

    public void addSuns(Sun sun) {
        if (suns == null) {
            suns = new Sun[1];
            suns[0] = sun;
        } else {
            SpaceObject[] sunArray = new Sun[suns.length + 1];
            for (int i = 0; i < suns.length; i++) {
                sunArray[i] = suns[i];
            }
            sunArray[suns.length + 1] = sun;
            suns = sunArray;
        }
    }

    public void addPlanet(String sunName, Planet planet) {
        for (SpaceObject object : suns) {
            if (object.getName().equalsIgnoreCase(sunName)) {
                Sun sun = (Sun) object;
                sun.addPlanet(planet);
            }
        }
    }

    public void addSatellite(String sunName, String planetName, Satellite satellite) {
        for (SpaceObject object : suns) {
            if (object.getName().equalsIgnoreCase(sunName)) {
                Sun sun = (Sun) object;
                SpaceObject[] planets = sun.getPlanets();
                for (SpaceObject item : planets) {
                    Planet planet = (Planet) item;
                    if (planet.getName().equalsIgnoreCase(planetName)) {
                        planet.addSatellite(satellite);
                    }
                }
            }
        }
    }

    public void printSolarSystem() {
        for (SpaceObject object : suns) {
            System.out.println(object);
        }
    }
}

