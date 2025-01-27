import java.io.*;
import java.util.Scanner;

/**
   This class reads numbers from a file, calculates the
   mean and standard deviation, and writes the results
   to a file.
*/

public class StatsDemo
{
   // TASK #3 Add the throws clause
   public static void main (String[] args) 
   throws IOException 
   {
      double sum = 0;      // The sum of the numbers
      int count = 0;       // The number of numbers added
      double mean = 0;     // The average of the numbers
      double stdDev = 0;   // The standard deviation
      double difference;   // The value and mean difference

      // Create an object of type Scanner
      Scanner keyboard = new Scanner (System.in);
      String filename;     // The user input file name

      // Prompt the user and read in the file name
      System.out.println("\nThis program calculates " + 
                         "statistics on a file " +
                         "containing a series of numbers");
      System.out.print("Enter the file name:  ");
      filename = keyboard.nextLine();
      filename = filename + ".txt";

      // ADD LINES FOR TASK #4 HERE
      File file = new File("Numbers.txt");
      
      if ( file.exists()){
          Scanner fileScanner = new Scanner(file);

              while (fileScanner.hasNextDouble()) {
                  sum += fileScanner.nextDouble();
                  count++;
                  
              }
              
              mean = sum / count;
          }

      // ADD LINES FOR TASK #5 HERE
      if ( file.exists()){
         sum = 0;
         count = 0;
         Scanner fileScanner = new Scanner(file);

              while (fileScanner.hasNextDouble()) {
                  double num = fileScanner.nextDouble();
                  difference = num - mean;
                  sum += Math.pow(difference, 2);
                  count++;
              }
              fileScanner.close();
              double variance = sum / count;
              stdDev = Math.sqrt(variance);
            //   System.out.println(stdDev);    for checking value
            //   System.out.println(mean);      for checking value
      }
   

      // ADD LINES FOR TASK #3 HERE
      PrintWriter output = new PrintWriter(filename);
      FileWriter fwriter = new FileWriter(filename, true);
      output = new PrintWriter(fwriter);
      output.printf("Mean = %.3f\n", mean);
      output.printf("Standard Deviation = %.3f\n", stdDev);
      output.close();

}
}