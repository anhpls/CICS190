package Midterm;
import java.util.ArrayList;

public class StudentMethods {
    public static void main(String[] args) {
        
    }

    //two dimensional array of student name and their tuition cost or two arrays: studentname and tuition
    
    double [] tuition = {};
    
    String [] studentList = {};
   
    

    public void getStudentInfo(Student[] student)
    {
        for(int i = 0; i < studentList.length; i++)
        {
            
            System.out.println(studentList[i]);
        }
    }

    public double calculateTuition(Student[] students)
    {
        double totalTuitionCost = 0;
        for(int i = 0; i< studentList.length; i++) 
        {
            totalTuitionCost += student.totalTuition;
        }
        return totalTuitionCost / studentList.length; // AVG total tuition should be totalTuition / number of students
    }

    public String[] getStudentNames(Student[] students) {
        String[] names = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            names[i] = students[i].getStudentName(); 
        }
        return names;
    }
}
