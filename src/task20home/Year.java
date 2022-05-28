package task20home;

public class Year extends Point{

   private final Month[] months;

    public Year(int number, Month[] month) {
        super(number);
        this.months = month;
    }


    public Month[] getMonth() {
        return months;
    }
}
