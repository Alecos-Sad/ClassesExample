package task06home;

public class Task06Main {

    public static void main(String[] args) {

        Sun sun = new Sun();
        Earth earth = new Earth();
        Moon moon = new Moon();
        Deimos deimos = new Deimos();
        Fobos fobos = new Fobos();
        Mars mars = new Mars();

        Sun[] suns = {sun};
        Planet[] planets = {earth};
        Satellite[] satellitesEarth = {moon};
        Satellite[] satellitesMars = {deimos, fobos};
        earth.setSatellites(satellitesEarth);
        mars.setSatellites(satellitesMars);


        SolarSystem solarSystem = new SolarSystem("Solar System", suns, planets);
        solarSystem.addPlanet(mars);
        System.out.println(solarSystem);
        System.out.println("Number of Stars : " + solarSystem.getNumbersOfStars());


    }
}
