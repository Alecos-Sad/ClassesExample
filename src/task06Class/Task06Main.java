package task06Class;

import task06Class.system.impl.Planet;
import task06Class.system.impl.Satellite;
import task06Class.system.impl.Sun;

public class Task06Main {

    public static void main(String[] args) {

        Sun sun = new Sun("Sun");
        Planet earth = new Planet("Earth");
        Planet mars = new Planet("Mars");
        Satellite moon = new Satellite("Moon");
        Satellite phobos = new Satellite("Fobos");
        Satellite demos = new Satellite("Daimos");

        SolarSystem solarSystem = new SolarSystem();
        solarSystem.addSuns(sun);
        solarSystem.addPlanet("sun",earth);
        solarSystem.addSatellite("sun","earth",moon);
        solarSystem.addPlanet("sun",mars);
        solarSystem.addSatellite("SUN","mars", phobos);
        solarSystem.addSatellite("SUN","mars", demos);
        solarSystem.printSolarSystem();

    }
}
