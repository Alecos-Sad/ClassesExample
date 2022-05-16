package task07;

public class Task07Main {

    public static void main(String[] args) {

        String[] data = {
                "movie", "game", "porn", "viRUS", "books", "VIRus"
        };

        HDD hdd = new HDD(1000.0);
       // HDD hdd1 = new HDD(1500.5);
        hdd.setData(data);

        FDD fdd = new FDD();
        RAM ram = new RAM(16000.0, 1600);
        CPU cpu = new CPU(16.0, 3500);

//        Computer computer = new Computer(hdd,fdd,ram,cpu);
//
//        computer.checkHDD();
//        computer.power();
//        computer.checkHDD();
//
//        System.out.println(computer.getHdd().getEmkost());

        Computer2 computer2 = new Computer2(
                new Component[]{
                        hdd, fdd, cpu, ram
                }
        );

        computer2.power();
        computer2.hddVolume();
        computer2.hddCheck();


    }

}
