package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        String[] students = {"student1" ,"student2"};
        int[] ages = {16,15};
        int[] grade = {90,80};

        for(int i=0; i< students.length; i++){
            System.out.println("학생 : "+students[i] + " 나이 : " + ages[i] + " 성적 : " + grade[i]);
        }

    }
}
