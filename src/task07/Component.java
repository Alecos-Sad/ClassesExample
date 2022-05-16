package task07;

public abstract class Component {

    private final String name;
    private final Double emkost;


    public Component(String name, Double volume) {
        this.name = name;
        this.emkost = volume;
    }

    public String getName() {
        return name;
    }

    public double getEmkost() {
        return emkost;
    }

    public int getVolumeIntValueEmkost() {
        return emkost.intValue();
    }

    @Override
    public String toString() {
        return name + ": " + "volume= " + emkost;
    }
}
