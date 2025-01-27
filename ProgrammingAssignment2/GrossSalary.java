import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int days;
        double  hoursEntry,
                totalPay = 0, 
                payPerHour, 
                grossPay = 0, 
                tips = 0, 
                totalDailyTips = 0, 
                payWithTips = 0, 
                accumulatedTips = 0, 
                grossPayWithTips = 0;   
        String userContinue = "y";

        while (userContinue.equalsIgnoreCase("y")){
        // reset variables if user chooses to calculate again
        totalPay = 0; 
        payPerHour = 0; 
        grossPay = 0;
        tips = 0;
        totalDailyTips = 0; 
        payWithTips = 0; 
        accumulatedTips = 0;
        grossPayWithTips = 0; 

        System.out.println("""
                    \n
                    ---------- GROSS SALARY CALCULATOR ----------
                    \nCalculate your gross salary with this program. 
                    Please enter your hourly payrate:""");
        payPerHour = keyb.nextDouble();
        //Validate Input for Hourly Wages
        while (payPerHour < 5 || payPerHour > 30){
            System.out.print("""
                        \nInvalid Wage Input. Please try again.
                        Please re-enter your hourly payrate:
                        """);
            payPerHour = keyb.nextDouble();
        }

            System.out.printf("Hourly Wage: $%.2f", payPerHour);
            System.out.println("\n\nPlease enter the number of days worked: ");
            days = keyb.nextInt();
            
            for (int count = 1; count <= days; count++){   
                totalDailyTips = 0;           
                System.out.println("\nHow many hours did you work for Day " + count + " ?");
                hoursEntry = keyb.nextDouble();

                System.out.println("\nPlease enter any tips that you received for this day (Enter -1 if none): ");
                tips = keyb.nextDouble();
                // Sentinel Controlled Loop with input validation
                while (tips != -1){
                    while (tips < -1 || tips == 0) {
                        System.out.print("Invalid Entry. Please re-enter a tip amount: ");
                        tips = keyb.nextDouble();
                    }
                    totalDailyTips += tips;
                    accumulatedTips += tips;
                    System.out.println("\nPlease enter the next tip amount (Enter -1 to stop): ");
                    tips = keyb.nextDouble();
                }

                // Overtime vs No Overtime Pay
                if (hoursEntry > 40) { 
                    totalPay =  ((hoursEntry - 40) * (payPerHour * 1.5)) + (40 * payPerHour); // ((45-40) * (15.50 *1.5)) + 40 * 15.50
                    payWithTips = totalDailyTips + totalPay;
                    System.out.printf("""
                            \nDay %d
                            Tips for the day: $%.2f
                            Salary Pay: $%.2f
                            Gross Pay with Tips: $%.2f
                            """, count, totalDailyTips, totalPay, payWithTips);
                } else {
                    totalPay = payPerHour * hoursEntry;
                    payWithTips = totalDailyTips + totalPay;
                    System.out.printf("""
                            \nDay %d
                            Tips: $%.2f
                            Salary Pay: $%.2f
                            Gross Pay with Tips: $%.2f
                            """, count, totalDailyTips, totalPay, payWithTips);
                }
            
            grossPay += totalPay;
            grossPayWithTips = grossPay + accumulatedTips;

            }
            // Ending Console Prints
            System.out.printf("""
                    \nAccumulated tips for the day(s) worked: $%.2f
                    Gross Salary Pay (with tips): $%,.2f
                    """, accumulatedTips, grossPayWithTips);

            System.out.println("\nWould you like to calculate your gross salary again? \t(Y/N)");
            userContinue = keyb.next();
        }

        System.out.println("\nProgram has stopped.");
    }
}
