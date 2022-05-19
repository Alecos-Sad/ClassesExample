package task10home;

public class Dog extends Animal {

   public Dog(String name) {
        super(name);
    }



    public void vote() {

       System.out.println(getName() + " : Bark! Bark");
    }

    public void jump() {

       System.out.println(getName() + " : is Jumping!");
    }

    public void run() {

       System.out.println(getName() + " : is Running!");
    }

    public void bite() {

       System.out.println(getName() + " : is BITES everyone around !");
    }

    @Override
    public String toString() {
        return "Dog: " + getName();
    }
}
