package Chapter2;
import java.text.DecimalFormat;
import java.util.Scanner;

/** 
    Mileage Program uses user inputs to turn miles driven and
    gallons used to calculate for miles per gallon (MPG). 
    Anh Huynh
    09/02/2024
*/

public class Mileage {
    public static void main(String[]args){
        Scanner keyb = new Scanner(System.in); // create scanner object used to read user's input
        DecimalFormat df = new DecimalFormat("#.0"); // formatting mpg output

        double milesDriven, gallonsUsed, mpg; // declaring miles driven, gallons used, and calculated mpg variables

        System.out.println("\nWelcome to the Mileage Program! This will calculate your gas mileage in miles per gallon.\nLet's begin...\n\nPlease enter the amount of miles driven: "); // Initial message and first prompt for milesDriven input
        milesDriven = keyb.nextDouble(); // Stores input as double in milesDriven variable
        System.out.println("\nSo you've driven " + milesDriven + " miles.\n\nHow many gallons were used?" ); // display user input of milesDriven and prompts user for gallonsUsed
        gallonsUsed = keyb.nextDouble(); // Stores input as double in gallonsUsed variable
        mpg = milesDriven / gallonsUsed; // formula for calculating miles per gallon (milesDriven / gallonsUsed)
        System.out.println("\nBy driving " + milesDriven + " miles with " + gallonsUsed + " gallons of gas, you are getting " + df.format(mpg) + " miles per gallon (mpg)."); // prints results

        /*      Miles Driven        |       Gallons Used        |       Mpg (hand calculated)       |         Mpg (output)      
                2000                        100                         20                                    20.0
                500                         25.5                        19.6078431                            19.6
                241.5                       10                          24.15                                 24.1
                100                         0                           Error                                 ∞
         */

    }
}
