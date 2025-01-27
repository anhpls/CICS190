package Chapter2;

import java.text.DecimalFormat;
import java.util.Scanner; // TASK #2 Add an import statement for the Scanner class

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      Scanner keyb = new Scanner(System.in); // TASK #2 Create a Scanner object here
      DecimalFormat df = new DecimalFormat("#.0");

      // Identifier declarations
      final int NUMBER = 2 ;        // Number of scores
      final int SCORE1 = 100;       // First test score
      final int SCORE2 = 95;        // Second test score
      final int BOILING_IN_F = 212; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output

      String firstName, lastName, fullName;// TASK #2 declare variables used here
      char firstInitial;// TASK #3 declare variables used here
      double diameter, radius, volume;// TASK #4 declare variables used here
      

      // Find an arithmetic average.
      average = ((double) SCORE1 + SCORE2) / NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println("\n" + output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (5 * (BOILING_IN_F - 32)) / 9;
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius, which is the temperature that water boils at.";
      System.out.println(output + "\n");

      // ADD LINES FOR TASK #2 HERE
      System.out.println("Enter your first name: "); // Prompt the user for first name
      firstName = keyb.next(); // Read the user's first name
      System.out.println("Enter your last name:"); // Prompt the user for last name
      lastName = keyb.next();// Read the user's last name
      fullName = firstName + " " + lastName;// Concatenate the user's first and last names
      System.out.println("\n" + fullName + "\n");// Print out the user's full name


      // ADD LINES FOR TASK #3 HERE
      firstInitial = firstName.charAt(0); // Get the first character from the user's first name  
      fullName = fullName.toUpperCase(); // Convert the user's full name to uppercase
      System.out.println(firstInitial + "\n" + "\n" + fullName + "\n" + fullName.length() + " characters"); // Print out the user's first initial and full name in uppercase
 
      // ADD LINES FOR TASK #4 HERE
      System.out.println("\nHello! Please enter a length for the diameter of a sphere:");// Prompt the user for a diameter of a sphere
      diameter = keyb.nextDouble(); // Read the diameter
      radius = diameter / 2; // Calculate the radiu
      volume = (4 * (Math.PI * Math.pow(radius, 3))) / 3; // Calculate the volume
      System.out.println("\n" +  "With your diameter of " + diameter + ", the sphere's radius would be " + radius + " and the volume would be approximately " + df.format(volume)); // Print out the diameter, radius, and volume

      /*    Diameter: 2          | Volume (hand calculated): 4.18879             | Volume (output): 4.2
            Diameter: 25.4       | Volume (hand calculated): 8580.24665          | Volume (output): 8580.2
            Diameter: 875000     | Volume (hand calculated): 350770273496516610  | Volume (output): 350770273496516610.0 / 3.5077027349651661E17 (not formatted)
      */

   }
}