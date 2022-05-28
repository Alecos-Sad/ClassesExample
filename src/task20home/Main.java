package task20home;

public class Main {

    public static void main(String[] args) {
        Year[] years = getYears(2020, 2);
        for (Year year : years) {
            System.out.println(year.getNumber());
        }
        Year date = new Year(2021, new Month[]{new Month(5, new Day[]{new Day(7)})});
    }

    private static Year[] getYears(int number, int count) {
        Year[] years = new Year[count];
        for (int i = 0; i < count; i++) {
            years[i] = getYear(number++);
        }
        return years;
    }

    private static Year getYear(int number) {
        return new Year(number, getMonths());
    }

    private static Month[] getMonths() {
        return new Month[]{
                getMonth(1, 31),
                getMonth(2, 28),
                getMonth(3, 31),
                getMonth(4, 30),
                getMonth(5, 31),
                getMonth(6, 30),
                getMonth(7, 31),
                getMonth(8, 31),
                getMonth(9, 30),
                getMonth(10, 31),
                getMonth(11, 30),
                getMonth(12, 31),
        };
    }

    private static Month getMonth(int number, int count) {
        Day[] days = new Day[count];
        for (int i = 1; i < count; i++) {
            days[i - 1] = new Day(i);
        }
        return new Month(number, days);
    }
}
