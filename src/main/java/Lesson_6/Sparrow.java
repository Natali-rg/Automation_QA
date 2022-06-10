package Lesson_6;

public class Sparrow extends Bird{

    private int distance;
    private String name;

    public Sparrow(String vid, int distance, String name) {
        super(vid);
        this.distance = distance;
        this.name = name;
    }

    public Sparrow(String vid, String name) {
        super(vid);
        this.name = name;
        this.distance = 10;
    }

    public void fly(){
        System.out.println("I can fly!");
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
