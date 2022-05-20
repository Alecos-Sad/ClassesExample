package task10home;

public class Task10HomeMain {

    public static void main(String[] args) {

        Dog pepperoniDog = new Dog("Pepperoni");
        Puppy puppyValet = new Puppy("Valet");
        Puppy puppyTrevor = new Puppy("Trevor");


        System.out.println(pepperoniDog);

        System.out.println(puppyTrevor.getName());
        pepperoniDog.vote();
        puppyTrevor.vote();
        pepperoniDog.jump();
        puppyValet.jump();
        pepperoniDog.bite();
        puppyTrevor.run();

    }
}
