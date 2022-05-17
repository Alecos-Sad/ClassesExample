package task06home;

import java.util.Arrays;

public abstract class GalaSystem {

    private Star[] stars;
    private Planet[] planets;

    public GalaSystem(Star[] stars, Planet[] planets) {
        this.stars = stars;
        this.planets = planets;
    }

    public void setStars(Star[] stars) {
        this.stars = stars;
    }

    public void setPlanets(Planet[] planets) {
        this.planets = planets;
    }

    @Override
    public String toString() {
        return "GalaSystem: " + "Stars: " + Arrays.toString(stars) + ", Planets: " + Arrays.toString(planets);
    }
}
