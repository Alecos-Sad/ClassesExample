package task11class;

public class Pinguin extends Bird {

    @Override
    public void fly() {
        System.out.println("Dont fly");
    }

    @Override
    public void sing() {
        System.out.println("Sing terrible");
    }

    public void swim() {
        System.out.println("Swim very well");
    }

}
