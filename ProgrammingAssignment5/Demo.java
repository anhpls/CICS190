package ProgrammingAssignment5;

public class Demo {
    public static void main(String[] args) {

        
        Student [] students = new Student[3];

        students[0] = new Student("Haven", 500);
        students[1] = new GraduateStudent("Dennis", 400, 200);
        students[2] = new GraduateStudent("Kenny", 800, 300);

        for (Student student : students)
        {
            System.out.println(student.toString());
        }
    }
}
