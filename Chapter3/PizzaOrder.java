package Chapter3;
import java.util.Scanner;  // Needed for the Scanner class

/**
   This program allows the user to order a pizza.
*/

public class PizzaOrder
{
   public static void main (String[] args)
   {
      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner (System.in);

      String firstName;             // User's first name
      boolean discount = false;     // Flag for discount
      int inches;                   // Size of the pizza
      char crustType;               // For type of crust
      String crust;                 // Name of crust
      double cost;                  // Cost of the pizza
      final double TAX_RATE = .08;  // Sales tax rate
      double tax;                   // Amount of tax
      char choice;                  // User's choice
      String input;                 // User input
      String toppings = "Cheese ";  // List of toppings
      int numberOfToppings = 0;     // Number of toppings

      // Prompt user and get first name.
      System.out.println("\nWelcome to Mike and " +
                         "Diane's Pizza");
      System.out.print("Enter your first name: ");
      firstName = keyboard.next();

      // Determine if user is eligible for discount by
      // having the same first name as one of the owners.
      
      // ADD LINES HERE FOR TASK #1
      String mike = "Mike";
      String diane = "Diane";

      
      if (firstName.equalsIgnoreCase(mike) || firstName.equalsIgnoreCase(diane)){
         discount = true;
      }

      // Prompt user and get pizza size choice.
      System.out.println("Pizza Size (inches)   Cost");
      System.out.println("        10            $10.99");
      System.out.println("        12            $12.99");
      System.out.println("        14            $14.99");
      System.out.println("        16            $16.99");
      System.out.println("What size pizza " +
                         "would you like?");
      System.out.print("10, 12, 14, or 16 " +
                       "(enter the number only): ");
      inches = keyboard.nextInt();

      // Set price and size of pizza ordered.
      // ADD LINES HERE FOR TASK #2
      if (inches == 10) {
         cost = 10.99;
      } else if (inches == 12){
         cost = 12.99;
      } else if (inches == 14){
         cost = 14.99;
      } else if (inches == 16){
         cost = 16.99;
      } else {
         System.out.println("\nThat was not a valid entry, therefore a 12 inch pizza will be made.");
         inches = 12;
         cost = 12.99;
      }

      // switch (inches){
      //    case 10 -> cost = 10.99;
      //    case 12 -> cost = 12.99;
      //    case 14 -> cost = 14.99;
      //    case 16 -> cost = 16.99;
      //    default -> {
      //        System.out.println("\nThat was not a valid entry, therefore a 12 inch pizza will be made.");
      //        inches = 12;
      //        cost = 12.99;
      //      } 
      // }
      
      
      // Consume the remaining newline character.
      keyboard.nextLine();

      // Prompt user and get crust choice.
      System.out.println("\nWhat type of crust would you like? ");
      System.out.print("(H) Hand-tossed, " +
                       "(T) Thin-crust, or " +
                       "(D) Deep-dish " +
                       "(enter H, T, or D): ");
      input = keyboard.next();
      crustType = input.charAt(0);

      // Set user's crust choice on pizza ordered.
      // ADD LINES FOR TASK #3
      switch (crustType){
         case 'H', 'h' -> crust = "Hand-Tossed";
         case 'T', 't' -> crust = "Thin-Crust";
         case 'D', 'd' -> crust = "Deep-dish";
         default -> {
            System.out.println("\nInvalid Entry. A hand-tossed crust will be made.");
            crust = "Hand-tossed";
         }
      }

      // Prompt user and get topping choices one at a time.
      System.out.println("\nAll pizzas come with cheese.");
      System.out.println("Additional toppings are " +
                         "$1.25 each, choose from:");
      System.out.println("Pepperoni, Sausage, " +
                         "Onion, Mushroom");

      // If topping is desired,
      // add to topping list and number of toppings
      System.out.print("\nDo you want Pepperoni? (Y/N):\n");
      input = keyboard.next();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Pepperoni ";
      }

      System.out.print("Do you want Sausage? (Y/N):\n");
      input = keyboard.next();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Sausage ";
      }

      System.out.print("Do you want Onion? (Y/N):\n");
      input = keyboard.next();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Onion ";
      }

      System.out.print("Do you want Mushroom? (Y/N):\n");
      input = keyboard.next();
      choice = input.charAt(0);
      if (choice == 'Y' || choice == 'y')
      {
         numberOfToppings += 1;
         toppings = toppings + "Mushroom ";
      }

      // Add additional toppings cost to cost of pizza.
      cost = cost + (1.25 * numberOfToppings);

      // Display order confirmation.
      System.out.println();
      System.out.println("Your order is as follows:\n");
      System.out.println(inches + " inch pizza");
      System.out.println(crust + " crust");
      System.out.println("Toppings: " + toppings + "\n");

      // Apply discount if user is eligible.
      // ADD LINES FOR TASK #4 HERE
      if (discount == true) {
         System.out.println("You have receieved a special discount of $2.00 off on your order.");
         System.out.printf("Before discount applied: $%4.2f\n",cost);
         cost -= 2; 
         System.out.printf("After discount applied: $%4.2f\n", cost); 
      }

      // EDIT PROGRAM FOR TASK #5
      // SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
      System.out.printf("The cost of your order " +
                        "is: $%4.2f\n", cost);

      // Calculate and display tax and total cost.
      tax = cost * TAX_RATE;
      System.out.printf("The tax is: $%4.2f\n", tax);
      System.out.printf("The total due is: $%4.2f\n",
                        (tax + cost));

      System.out.println("\nYour order will be ready " +
                         "for pickup in 30 minutes.");
      }
}