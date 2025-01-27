package ProgrammingAssignment4;

import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {

    ArrayList<Student> students = new ArrayList<>();

    for (int i = 0; i < 7; i++) 
    {
        students.add(new Student());
    }
    

    for (int i = 0; i < students.size(); i++) {
        System.out.print("Student " + (i + 1) + ":\n");
    students.get(i).display();
    }

    int lowestAvg = findLowestAvg(students);
    System.out.println("\nLowest Avg is:");
    students.get(lowestAvg).display();
    students.remove(lowestAvg);
    students.add(4, new Student());

    System.out.println("\nUpdated Student List:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ":");
            students.get(i).display();
        }

    }

    public static int findLowestAvg(ArrayList<Student> students) {
        int lowest = 0;                     // assuming index 0 has lowest avg
        double lowestAvg = students.get(0).getAvg();   

        // loop through the list to find the student with the lowest average
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAvg() < lowestAvg) {
                lowestAvg = students.get(i).getAvg();  
                lowest = i;  // update the index of the student with the lowest average
            }
        }
        return lowest;  // return the index of the student with the lowest average
    }
}

