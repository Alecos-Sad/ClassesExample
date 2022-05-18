package task06home;

public abstract class GalaSystem {

    private Star[] stars;
    private Planet[] planets;
    private final String name;

    public GalaSystem(String name, Star[] stars, Planet[] planets) {
        this.name = name;
        this.stars = stars;
        this.planets = planets;

    }

    public void addPlanet(Planet planet) {
        Planet[] data = new Planet[planets.length + 1];
        int len = data.length;
        System.arraycopy(planets, 0, data, 0, len - 1);
        data[len - 1] = planet;
        planets = data;
    }

    public void setStars(Star[] stars) {
        this.stars = stars;
    }

    public Star[] getStars() {
        return stars;
    }

    public int getNumbersOfStars() {
        return stars.length;
    }

    public Planet[] getPlanets() {
        return planets;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder str1 = new StringBuilder();
        for (Star star : stars) {
            str1
                    .append("\t")
                    .append(star)
                    .append("\n");
        }
        StringBuilder str2 = new StringBuilder();
        for (Planet planet : planets) {
            str2
                    .append("\t")
                    .append(planet)
                    .append("\n");
        }
        return "Name: " + name + "\n"
                + "Stars: " + "\n" + str1
                + "\n" + "Planets: " + "\n" + str2;
    }
}

