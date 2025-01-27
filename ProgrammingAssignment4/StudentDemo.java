package ProgrammingAssignment4;

public class StudentDemo {
    public static void main(String[] args) {
        Student [] classList = new Student[10];
        
        double [] s1 = {80, 50.0, 99.2, 70.5, 90.0};
        double [] s2 = {35.0, 80.5, 100.0, 86.9, 95.6};

        classList [0] = new Student(s1);
        classList [1] = new Student(s2);

        for (int i = 2; i < classList.length; i++) 
        {
            classList[i] = new Student();
        }

        printStudents(classList);

        int topRankStudent = rank1student(classList); 

        System.out.println("\nTop student stats: ");
        classList[topRankStudent].display();
    }

    public static void printStudents(Student [] classList) 
    {
        for (int i = 0; i < classList.length; i++)
        {
            System.out.println("Student " + (i + 1));
            classList[i].display();
            System.out.println();
        }
    }

    public static int rank1student (Student [] classList)
    {
        int rank1 = 0; // assume index 0 has highest avg 
        double topAvg = classList[0].getAvg();  // avg of index 0

        for (int i = 1; i < classList.length; i++)
        {
            if (classList[i].getAvg() > topAvg) 
            {
                topAvg = classList[i].getAvg();
                rank1 = i;
            }
        }
        return rank1;
    }
    
}
