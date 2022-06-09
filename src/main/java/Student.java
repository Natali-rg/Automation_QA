public class Student {
    private String family;
    private String name;
    private int age;
    private int id;
    private int level;

    static public String str="Human";


    public int getAge() {
        return age;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void modifayLewel(int mark) {
        if ((level<10) && (level>0)){
           this.level=this.level+mark;
        }
    }

    public Student(String family, String name, int age) {
        int id;
        this.family = family;
        this.name = name;
        this.age = validate(age);
        this.id=(int) (Math.random()*10000);
        this.level=0;
    }

    private int validate(int age) {
        int result=16;
        if ((age>15) &&(age<55)){
            return age;
        }
        return 16;
    }

    public Student(String family, String name, int age, int id) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.id=id;
        this.level=0;
    }

    public Student() {
        System.out.println("constructor Error");
        this.family="Antonov";
        this.name="Anton";
        this.age=16;
        this.id=2554477;
        this.level=100;
    }


    public void print(){
        System.out.println("Family: "+this.family);
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("ID: "+id);
        System.out.println(str);
    }




}
