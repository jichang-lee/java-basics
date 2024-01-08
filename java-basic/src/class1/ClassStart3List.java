package class1;

import java.util.ArrayList;
import java.util.List;

public class ClassStart3List {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 16;
        student1.grade = 90;

        List<Student> students = new ArrayList<>();
        students.add(student1);
        System.out.println("students = " + students);
    }
}
