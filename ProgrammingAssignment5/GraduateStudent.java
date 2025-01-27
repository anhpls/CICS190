package ProgrammingAssignment5;

public class GraduateStudent extends Student {
    private double graduateFee;

    public GraduateStudent()
    {
        super();
        this.graduateFee = 0;
    }

    public GraduateStudent(String name, double coursefee, double graduateFee)
    {
        super(name, coursefee);
        this.graduateFee = graduateFee;
    }
    
    @Override
    public double tuition (int numOfCourses) 
    {
        return super.tuition(numOfCourses) + graduateFee;
    }

    @Override
    public String toString()
    {
        // int courses = 5;
        // double tuition = tuition(courses);
        return  super.toString() + 
                "\nFlat Graduate Fee: $" + graduateFee;
                // "\nGrad Tuition for 5 Courses: $" + tuition;
    }
}
