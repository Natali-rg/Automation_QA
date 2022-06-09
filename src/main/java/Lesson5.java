public class Lesson5 {
    public static void main(String[] args) {

        Student student=new Student("Turchyna","Natali", 39);
//        System.out.println(student.age);
//        student.print();
//        System.out.println("\n");

        Student student1=new Student("Ivanov", "Ivan", 35);
//        student1.print();
//        System.out.println("\n");

        Student student2=new Student("Tarasov","Valeriy",36,122456);
//        student2.print();
//        System.out.println("\n");

        Student.str="Animal";
//        student1.print();
//        student2.print();

//        System.out.println("\n");
//        student2.id=2345677;
//        student2.print();

//        System.out.println("\n");
//        Student student3=new Student();
//        student3.print();


        /////////encapsulation////////
        System.out.println(student.getAge());
        int studentAge= student.getAge();
        studentAge++;


        Eyes eyes = new Eyes("red", 3, true, 2);
        Cats cats = new Cats(12, "blue", false, 'm',eyes);








    }
}
