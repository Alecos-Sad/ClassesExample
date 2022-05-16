package task07;

public class CPU extends Frequency{

    public CPU(Double volume, int frequency) {
        super("CPU",volume, frequency);
    }

    public double getFrequencyDoubleValue(){
        return (double) getFrequency() / 1000;
    }
}
