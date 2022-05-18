package task06Class.system;

public abstract class SpaceObject {

    private final String name;

    public SpaceObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SpaceObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
