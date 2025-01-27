import java.util.Scanner;  // Needed for the Scanner class
import java.text.DecimalFormat; // format decimal places

/**
   This program calculates the total price which includes
   sales tax.
*/

public class SalesTax
{
   public static void main(String[] args)
   {
      // Identifier declarations
      final double TAX_RATE = 0.055;    // final = variables that do not change (const) 
      double price;
      double tax;
      double total;
      String item;

      // Create a Scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // Display prompts and get input.
      System.out.print("Item description:  ");
      item = keyboard.nextLine();
      System.out.print("Item price:  $");
      price = keyboard.nextDouble();

      // Perform the calculations.
      tax = price * TAX_RATE;
      total = price + tax;

      DecimalFormat dec = new DecimalFormat("#0.00");  // tested and it rounds up the number

      // Display the results.
      System.out.print(item + "        $");
      System.out.println(dec.format(price));
      System.out.print("Tax          $");
      System.out.println(dec.format(tax));
      System.out.print("Total        $");
      System.out.println(dec.format(total));
   }
}

// Anh Huynh