package task07;

public class HDD extends Component {

    private String[] data;

    public HDD(Double volume) {
        this("HDD", volume);
    }

    private HDD(String name, Double volume) {
        super(name, volume);

    }

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }
}
