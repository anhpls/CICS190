import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         choice = printMenu();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               value = circleArea(radius);

               System.out.printf("The area of the circle is %.2f\n", value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();
               
               value = rectangleArea(length, width);

               System.out.printf("The area of the rectangle is %.2f\n", value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               value = triangleArea(height, base);

               System.out.printf("The area of the triangle is %.2f\n", value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               value = circleCircumference(radius);

               System.out.printf("The circumference of the circle is %.2f\n", value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               value = rectanglePerimeter(length, width);

               System.out.printf("The perimeter of the rectangle is %.2f\n", value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               value = trianglePerimeter(side1, side2, side3);

               System.out.printf("The perimeter of the triangle is %.2f\n", value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');

   }

   /**
    * Method printMenu()
    * Prints out the menu of options for the user to select from
    * @return return user's choice and keyboard input as an int in variable named "selection"
    */
   public static int printMenu(){

      Scanner keyb = new Scanner(System.in);

      System.out.print("""
            \nThis is a geometry calculator.
            Choose what you would like to calculate:
            1. Find the area of a circle
            2. Find the area of a rectangle
            3. Find the area of a triangle
            4. Find the circumference of a circle
            5. Find the perimeter of a rectangle
            6. Find the perimeter of a triangle
            Enter the number of your choice: 
            """);
      int selection = keyb.nextInt();
      return selection;
   }
   
   /**
    * Method circleArea()
    * Calculates the area of a circle using A = πr^2
    * @param r user-input radius
    * @return return the area of the circle as a double
    */
   public static double circleArea(double r){
      double area = Math.PI * (r * r );
      return area;
   }

   /**
    * Method rectangleArea()
    * Calculates the area of a rectangle using A = lw
    * @param l user-input length
    * @param w user-input width
    * @return return the area of the rectangle as a double
    */
   public static double rectangleArea(double l, double w){
      double area = l * w;
      return area;
   }

   /**
    * Method triangleArea()
    * Calculates the area of a triangle using A = ½bh
    * @param h user-input height
    * @param b user-input base
    * @return return the area of the triangle as a double
    */
   public static double triangleArea(double h, double b){
      double area = 0.5 * b * h;
      return area;
   }

   /**
    * Method circleCircumference()
    * Calculates the circumference of a circle using C = 2πr
    * @param r user-input radius
    * @return return the circumference of the circle as a double variable, using the given formula
    */
   public static double circleCircumference(double r){
      double circumference = 2 * Math.PI * r;
      return circumference;
   }

   /**
    * Method rectanglePerimeter()
    * Calculates the perimeter of a rectangle using P = 2l +2w
    * @param l user-input length
    * @param w user-input width
    * @return return the perimeter of the rectangle as a double variable, using the given formula
    */
   public static double rectanglePerimeter(double l, double w){
      double perimeter = (2 * l) + (2 * w);
      return perimeter;
   }

   /**
    * Method trianglePerimeter()
    * Calculates the perimeter of a triangle by getting the sum of all the sides 
    * @param s1 user-input side 1
    * @param s2 user-input side 2
    * @param s3 user-input side 3
    * @return return the perimeter of the triangle as a double variable
    */
   public static double trianglePerimeter(double s1, double s2, double s3){
      double perimeter = s1 + s2 + s3;
      return perimeter;
   }
}