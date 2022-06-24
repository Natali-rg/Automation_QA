package HomeWork_8;

public class Cat extends Animal implements Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println("Feeding cat "+ super.getName());
    }

    @Override
    public void walk() {
        System.out.println("Walking cat "+super.getName());
    }

    @Override
    public void play() {
        System.out.println("Playing cat "+super.getName());
    }

    @Override
    void greets() {
     System.out.println("Cat "+super.getName()+" "+"says meow");
    }

}
