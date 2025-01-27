package ProgrammingAssignment4;

import java.util.Random;

public class Student {

    private double [] grades;
    Random random = new Random();

    // public static void main(String[] args) {
    //     Student student = new Student();
    //     student.display();
    // }

    // no args constructor 
    public Student()                
    {
        grades = new double[5];
        
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = 50 + random.nextInt(51);
        }
    }

    // return grades array
    public double [] getGradesArray()
    {
        return grades;
    }

     // receieves array and copies
    public Student(double [] grades2)      
    {
        grades = new double[5];
        for (int i = 0; i < grades.length; i++)
        {
            grades[i] = grades2[i];
        }
    }

    // sets grade at certain index
    public double setGrade(int subscript, double value)                 
    {
        grades[subscript] = value;
        return grades[subscript]; 
    }

    // get average grades
    public double getAvg(){
        double sum = 0;
        for (double grade: grades)
        {
            sum += grade;
        }

        return sum / grades.length;
    }

    
    // takes an array of grades as input and returns the maximum value in that array.
    public double getMax (double [] grades) 
    {
        double maxValue = grades[0];
        for (int i = 1; i < grades.length; i++)
        {
            if (grades[i] > maxValue) 
            {
                maxValue = grades[i];
            }
        }

        return maxValue;
    }


    public void display()
    {
        System.out.println("Grades:");
        for (double grade: grades)
        {
            System.out.print(grade + " ");
        }
        System.out.println("Average: " + getAvg());
    }

    
    
}
