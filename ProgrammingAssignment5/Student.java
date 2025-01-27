package ProgrammingAssignment5;

public class Student {
    private String name;
    private double courseFee;

    public Student()
    {
        this.name = "Default";
        this.courseFee = 300;
    }

    public Student(String name, double courseFee)
    {
        this.name = name;
        this.courseFee = courseFee;
    }

   

    public double tuition (int numOfCourses)
    {
        return numOfCourses * courseFee;
    }

    @Override
    public String toString () 
    {
        int courses = 5;
        double tuition = tuition(courses); 
        return  "\nName: " + name + 
                "\nTuition for 5 courses: $" + tuition;
    }
}
