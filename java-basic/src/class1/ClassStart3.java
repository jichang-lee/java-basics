package class1;

import java.util.ArrayList;
import java.util.List;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "student1";
        student1.age = 16;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "student2";
        student2.age = 15;
        student2.grade = 80;

        System.out.println("학생 : "+student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("학생 : "+student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

    }
}
