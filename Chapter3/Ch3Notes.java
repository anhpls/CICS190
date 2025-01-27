package Chapter3;

import java.util.Scanner;

public class Ch3Notes {
    public static void main (String[]args){
        Scanner keyb = new Scanner(System.in);
        // int x = 0, y = 5, z = x + y;

        // if (x > y){
        //     System.out.println("Mounted");
        // } else {
        //     System.out.println("Done");
        // }
        
    // double income;
    
    // Prompt
    // System.out.println("\nHello. Please enter your income: ");
    // income = keyb.nextInt();
    // if (income > 100000) {
    //     System.out.println("You already make over 100k!");
    // } else if (income < 100000) {
    //     System.out.println("You deserve a raise!");
    //     income += 20000;
    // } else {
    //     System.out.println("Hmmm right on the money...");
    // }
    // System.out.println("Here's your updated income: " + income);


    // Second practice
    // if (income > 100000) {
    //     income += 5000;
    // } else {
    //     if (income < 50000){
    //         income += 30000;
    //     } else {
    //         income += 10000;
    //     }
    // } 
    // System.out.println(income);


    /* 
        Logical Operators 
        
        AND         &&      both need to be true
        OR          ||      one needs to be true
        NOT         !       does the opposite to what its assigned to !true = false

        if (name1.equals(name2)) to compare what's inside the String variables
        if (name1.equalsIgnoreCase(name2)) ignore case sensitivity
        if (name1.compareTo(name2)) another option
            returns an integer -- if same, then 0 is return / if different, then 1 or -1 is returned // 1 means name2 > name1 // -1 is name1 > name2
        compareToIgnoreCase
        if (name1.compareTo(name2) == 1)

    
     */

        String name1 = "Ana";
        String name2 = "Anh";

        if (name2.compareTo(name1) > 0) {
            System.out.println("Positive Integer");
        } else {
            System.out.println("Negative Integer");
        }
        

        // int month = 1;
        // switch (month){
        //     case 1: System.out.println("January");
        //     break;
        //     case 2: System.out.println("Febrauary");
        //     break;
        //     default: System.out.println("Invalid");
        // }

        /* switch (status){
            case 0 single: 
            case 1 married: 
            case 2:

            name = keyboard.nextLine();
            char firstInitial = name.charAt(0);

            foodGrade = input.charAt(0);

            switch(foodGrade) {
                case 'A', 'a': 
                    System.out.println("blah blah blah");
                    break;
                case 'B', 'b':
                    System.out.println("Blah blah blah");
                    break;
            }


            Formatting
            System.out.printf(var, args);
            int x = 2000;

            System.out.printf("the price is %d.", x);    %d = decimal   %f = float

            Output: The price is 2000.

            int x = 2000;
            double y = 3.15;
            System.out.printf("the prices are %d and %f." x, y);

            Output: The prices are 2000 and 3.15.
            

            %5f  --- 5 means 5 characters / minimal width
            int x = 10;
            _ _ _ 1_0_      right justified --> within the 5 character width allocated 

            int x = 200000;
            %5f   
            200000         expands width because 5 is the MINIMUM width allocated;
            
            ("%,5f", x)         flags for the comma 
            int x = 200000;
            200,000
            
            double y = 31.51325
            ("%.2f", y)
            31.51

            %8.3f 
            _ _ _ 8_ ._ 5_ 1_ 3_   right justified because no following numbers / 3 decimal places


            CH3 Programming challenges
            
         */
        double weight, height, bmi;

        System.out.println("\nWelcome to the BMI Calculator. \nPlease enter your weight in lbs: ");
        weight = keyb.nextDouble();
        System.out.println("You currently weigh " + weight + " lbs" + "\n\nNow please enter your height in inches: "); // 5'8 = 68 inches
        height = keyb.nextDouble();
        bmi = (weight * 703) / Math.pow(height, 2);
        System.out.println("With your weight of " + weight + " and height of " + height + " inches, your BMI is " + bmi + ".\n");
        
        if (bmi > 18.5 && bmi < 25){
            System.out.printf("Congratulations. You have an optimal BMI of %3.2f", bmi);
        } else if (bmi < 18.5) {
            System.out.printf("You are underweight according to your BMI of %3.2f", bmi);
        } else if (bmi > 25) {
            System.out.printf("You are considered overweight according to your BMI of %3.2f", bmi);
        } else {
            System.out.println("Invalid entry. Please try again.");
        }
        System.out.println("\n");
            // write bmi value output with printf precision of 1






    }

    
    
}
