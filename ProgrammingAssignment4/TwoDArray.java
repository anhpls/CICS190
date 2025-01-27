package ProgrammingAssignment4;
import java.util.Random;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        Random random = new Random();
        
        // user prompts
        System.out.print("Please enter the number of rows: ");
        int rows = keyb.nextInt();
        System.out.print("Please enter the number of columns: ");
        int cols = keyb.nextInt();

        
        int[][] TwoDArray = new int[rows][cols];
        for (int i = 0; i < TwoDArray.length; i++) {
            for (int b = 0; b < TwoDArray[i].length; b++) {
                TwoDArray[i][b] = 10 + random.nextInt(81);  // random value between 10-90
            }
        }

        // display the array in rectangular form
        System.out.println("\n2D Array:");
        printArray(TwoDArray);

        // calculate and display the sum of each column
        int[] columnTotal = getColumnTotal(TwoDArray);
        System.out.println("\n1D Array:");
        printOneDArray(columnTotal);
    }

    public static void printArray(int[][] TwoDArray) {
        for (int[] row : TwoDArray) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    // calculates the sum of each column and returns it as a 1D array
    public static int[] getColumnTotal(int[][] TwoDArray) {
        int column = TwoDArray[0].length;
        int[] columnTotal = new int[column];

        for (int i = 0; i < column; i++) {
            for (int b = 0; b < TwoDArray.length; b++) {
                columnTotal[i] += TwoDArray[b][i];
            }
        }
        return columnTotal;
    }

    // print a 1D array
    public static void printOneDArray(int[] TwoDArray) {
        for (int num : TwoDArray) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}
    

