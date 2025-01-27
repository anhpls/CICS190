package Chapter4;
import java.util.Scanner;

public class ClassPractice {

    public static void main (String[]args){
        int totalSum = 0, maxNum;
        Scanner keyb = new Scanner(System.in);


        System.out.println("\nPlease enter a positive integer bigger than 0:");
        maxNum = keyb.nextInt();

        for(int count = 1; count <= maxNum; count++){
            totalSum += count;                  
        }
        System.out.printf("Number: %d | Sum: %d", maxNum, totalSum);

    
    }
}
