package task10home;

public class Dog extends Animal {

    private Puppy[] puppies;

    public Dog(String name) {
        super(name);
    }

    public Dog(String name, Puppy[] puppies) {
        super(name);
        this.puppies = puppies;
    }

    public Puppy[] getPuppies() {
        return puppies;
    }

    public void addPuppy(Puppy puppy) {
        if (puppy != null) {
            if (puppies == null) {
                puppies = new Puppy[1];
                puppies[0] = puppy;
            } else {
                Puppy[] newPuppyArray = new Puppy[puppies.length + 1];
                System.arraycopy(puppies, 0, newPuppyArray, 0, puppies.length);
                newPuppyArray[puppies.length] = puppy;
                puppies = newPuppyArray;
            }
        } else {
            System.out.println("Dog has no puppies!");
        }
    }

    public void vote() {
        System.out.println(this.getName() + " : Bark! Bark");
    }

    public void jump() {
        System.out.println(this.getName() + " : is Jumping!");
    }

    public void run() {
        System.out.println(this.getName() + " : is Running!");
    }

    public void bite() {
        System.out.println(this.getName() + " : is BITES everyone around !");
    }

    @Override
    public String toString() {
        StringBuilder puppiesStr = new StringBuilder();
        if (puppies != null && puppies.length > 0) {
            for (Puppy puppy : puppies) {
                puppiesStr.append(puppy.getName()).append("\n");
            }
        } else {
            System.out.println("\tNo puppies!");
        }
        return "Dog: " + getName() + "\n" + "Puppies: " + "\n" + puppiesStr;
    }
}
