import java.util.Scanner;

public class Grades {
    public static void main (String[]args){
        Scanner keyb = new Scanner(System.in);

        double grade;
        System.out.println("\nEnter your grade from 0-100: ");
        grade = keyb.nextDouble();
        
        if (grade > 0) {
            if (grade < 70) 
                System.out.println("Failing");
            else if (grade < 80) 
                System.out.println("C");
            else if (grade < 90) 
                System.out.println("B");
            else if (grade < 100)
                System.out.println("A");
            else if (grade > 100)
                System.out.println("Please re-enter a valid grade.");
        } else {
            System.out.println("Please re-enter a valid grade.");
        }
        

        

        } 

    }
    

