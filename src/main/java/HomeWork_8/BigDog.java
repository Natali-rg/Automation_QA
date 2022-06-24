package HomeWork_8;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    void greets() {
        super.greets();
    }

    @Override
    void greets(Dog another) {
        super.greets(another);
    }
    void greets(BigDog another){
        System.out.println("Dog " + super.getName() + " " + "says: Wooooooooooooooooof");
    }
}
