package task07;

public class Computer2 {

    private boolean status;
    private final Component[] components;

    public Computer2(Component[] components) {
        this.status = false;
        this.components = components;
    }

    public void power() {
        this.status = !status;
        System.out.println(status ? "Computer ON" : "Computer OFF");
    }

    public void hddVolume() {
        for (Component component : components) {
            if (component instanceof HDD) {
                System.out.println("HDD volume: " + component.getEmkost());
            }
        }
    }

    public void hddCheck() {
        for (Component component : components) {
            if (component instanceof HDD) {
                hddCheck(component);
            }
        }
    }

    public void hddCheck(Component component) {
        if (status) {
            HDD hdd = (HDD) component;
            System.out.println("____________________________________");
            System.out.println("______Before CHECK__________________");
            for (String d : hdd.getData()) {
                System.out.println(d);
            }
            String[] data = hdd.getData();
            int indx = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i].equalsIgnoreCase("virus")) {
                    data[i] = null;
                } else {
                    indx++;
                }
            }
            String[] newData = new String[indx];
            indx = 0;
            for (String dat : data) {
                if (dat != null) {
                    newData[indx] = dat;
                    indx++;
                }
            }
            hdd.setData(newData);
            System.out.println("__________AfterCheck__________________");
            for (String d : hdd.getData()) {
                System.out.println(d);
            }
            System.out.println("______________________________________");
        } else {
            System.out.println("Computer OFF");
        }
    }
}
