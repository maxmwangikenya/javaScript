public class Student{

    String name;
    int age;
    String course;

    public static void main(String[] args){

        Student student1 = new Student();

        student1.name = "Rosejoy";
        student1.age = 35;
        student1.course = "Software Engineering";

        System.out.println("name:" + student1.name);
    }
}