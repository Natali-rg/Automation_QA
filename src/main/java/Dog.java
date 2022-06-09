public class Dog {

    private String name;
    private int age;
    private String color;
    private float height;

    public Dog(String name, int age, String color, float height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.age = 3;
        this.height = 1.25f;
    }

    public void print(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Color: "+this.color);
        System.out.println("Height: "+this.height);
    }



    public Dog() {
        System.out.println("Create the object the class Dog");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public float getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
