package task07;

public class Computer {

    private boolean status;

    private final HDD hdd;
    private final FDD fdd;
    private final RAM ram;
    private final CPU cpu;

    public Computer(HDD hdd, FDD fdd, RAM ram, CPU cpu) {
        this.status = false;
        this.hdd = hdd;
        this.fdd = fdd;
        this.ram = ram;
        this.cpu = cpu;
    }

    public void power() {
        this.status = !status;
        System.out.println(status ? "Computer ON" : "Computer OFF");
    }

    public HDD getHdd() {
        return hdd;
    }

    public FDD getFdd() {
        return fdd;
    }

    public RAM getRam() {
        return ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void checkHDD(){
        if (status){
            System.out.println("Before CHECK: ");
            for(String data : hdd.getData()){
                System.out.println(data);
            }
            String [] data = hdd.getData();
            int indx = 0;
            for (int i = 0; i < data.length; i++) {
                if (data[i].equalsIgnoreCase("virus")){
                    data[i] = null;
                } else indx ++;
            }
            String [] newData = new String[indx];
            indx = 0;
            for(String dat : data){
                if (dat !=null){
                    newData[indx] = dat;
                    indx++;
                }
            }
            hdd.setData(newData);
            System.out.println("After CHECK");
            for (String str : hdd.getData()){
                System.out.println(str);
            }
        } else {
            System.out.println("Computer OFF");
        }
    }
}
