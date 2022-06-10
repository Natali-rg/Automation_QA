package Lesson_6;

public class Bird {
    private String vid;

    public void walk(){
        System.out.println("I can walk!");
    }

    public Bird(String vid) {
        this.vid = vid;
    }

    public String getVid() {
        return vid;
    }
}
