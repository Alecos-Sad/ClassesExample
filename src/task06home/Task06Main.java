package task06home;

public class Task06Main {

    public static void main(String[] args) {

        Star[] starsSolarSystem = new Star[]{new Sun()};
        Planet[] planetSolarSystem = new Planet[]{new Earth()};
        SolarSystem solarSystem = new SolarSystem(starsSolarSystem, planetSolarSystem);
        System.out.println(solarSystem);

    }
}
