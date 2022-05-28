package task20home;

public class Month extends Point {

    private Day[] days;

    public Month(int number, Day[] days) {
        super(number);
        this.days = days;
    }

    public Day[] getDays() {
        return days;
    }

}
