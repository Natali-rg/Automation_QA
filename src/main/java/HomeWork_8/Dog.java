package HomeWork_8;

public class Dog extends Animal implements Pet{//???????

    public Dog(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Feeding dog " + super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking dog " + super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing with dog " + super.getName());
    }

    @Override
    void greets() {
        System.out.println("Dog " + super.getName() + " " + "says: Woof");
    }
    void greets(Dog another){
        System.out.println("Dog " + super.getName() + " " + "says: Woooooof");
    }


}
