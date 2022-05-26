package task20class;

public class Main {

    public static void main(String[] args) {

    }


    private Month[] getMonth() {
        return new Month[]{
                getMonth(31),
                getMonth(28),
                getMonth(31),
                getMonth(30),
                getMonth(31),
                getMonth(30),
                getMonth(31),
                getMonth(31),
                getMonth(30),
                getMonth(31),
                getMonth(30),
                getMonth(31),
        };
    }

    private Month getMonth(int number, int count) {
        Day[] days = new Day[count];
        for (int i = 1; i <= count; i++) {
            days[i - 1] = new Day(i);
        }
        return new Month(number, day)
    }

    ;
}
