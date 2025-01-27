package Midterm;

public class Student {
    private String studentName;
    private int totalCreds;
    final int COST_PER_CREDIT = 0;
    double totalTuition = getTuitionCost();

    public Student(){
        studentName = "Default";
        totalCreds = 19;
    }
    
    public Student(String name, int creds){
        name = studentName;
        totalCreds = creds;
    }

    public String getStudentName(){
        return studentName;
    }

    public int getTotalCreds(){
        return totalCreds;
    }

    public  void setTotalCreds(int creds){
        if (creds >= 0)
        {
            totalCreds = creds;
        } else 
        {
            System.out.println("Please enter a positive value for creds");
        }
    }

    public double getTuitionCost(){
        double tuition = totalCreds * COST_PER_CREDIT;
        return tuition;
    }

    public void displayInfo(){
        System.out.printf("""
                Student Name: %s
                Number of Credits Taken: %d
                Total Tuition Cost: $%.2f
                """, studentName, totalCreds, totalTuition);
    }

}
