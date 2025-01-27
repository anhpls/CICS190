import java.util.Scanner;

/** This Java program, `PayrollDemo`, is a demonstration of managing 
payroll information for two employees using the `Payroll` class. */

public class PayrollDemo {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        char userControl;
        // Person 1 Variables using getter methods
        Payroll person1 = new Payroll();
        String name1 = person1.getEmployeeName();
        String id1 = person1.getId();
        double hourlyPay1 = person1.getHourlyPay();
        double hoursWorked1 = person1.getHoursWorked();
        double grossPay1 = person1.getGrossPay();
        
        

        do {

        // Display
        System.out.printf("""

                Person 1 Payroll 
                Name: %s
                ID: %s
                Hourly Pay: $%.2f
                Hours Worked: %.2f
                Gross Pay: $%,.2f
                """, name1, id1, hourlyPay1, hoursWorked1, grossPay1);
        
        // Updates to Values for Person 1
        person1.setHoursWorked(50);               // change number of hours worked
        hoursWorked1 = person1.getHoursWorked();        // re-assign to variable
        person1.giveRaise(10);                  // set raise percentage
        hourlyPay1 = person1.getHourlyPay();            // updated 'Hourly Pay' value after raise
        grossPay1 = person1.getGrossPay();              // updated 'Gross Pay' value 


        // Updated Display
        System.out.printf("""

                Person 1 Updated Payroll 
                Name: %s
                ID: %s
                Hourly Pay (Granted Bonuses): $%.2f
                Hours Worked (Updated): %.2f
                Gross Pay: $%,.2f
                """, name1, id1, hourlyPay1, hoursWorked1, grossPay1);


        // Person 2 Pre-Defined Values
        Payroll person2 = new Payroll("Anh Huynh", "0014");
        person2.setHourlyPay(19.20);
        person2.setHoursWorked(35.78);

        // Person 2 Variables using getter methods
        String name2 = person2.getEmployeeName();
        String id2 = person2.getId();
        double hourlyPay2 = person2.getHourlyPay();
        double hoursWorked2 = person2.getHoursWorked();
        double grossPay2 = person2.getGrossPay();
        

        // Display
        System.out.printf("""

                %s's Payroll 
                Name: %s
                ID: %s
                Hourly Pay: $%.2f
                Hours Worked: %.2f
                Gross Pay: $%,.2f
                """, name2, name2, id2, hourlyPay2, hoursWorked2, grossPay2);

        // Updated Values for Person 2
        person2.setHoursWorked(59.21);            //  change number of hours worked
        hoursWorked2 = person2.getHoursWorked();        //  re-assign new value to variable
        person2.giveRaise(20);                  //  set raise percentage
        hourlyPay2 = person2.getHourlyPay();            //  updated 'Hourly Pay' value after raise
        grossPay2 = person2.getGrossPay();              //  updated 'Gross Pay' value 
        
        // Updated Display
        System.out.printf("""

                %s's Updated Payroll 
                Name: %s
                ID: %s
                Hourly Pay (Granted Bonuses): $%.2f
                Hours Worked (Updated): %.2f
                Gross Pay: $%,.2f
                """, name2, name2, id2, hourlyPay2, hoursWorked2, grossPay2);

        System.out.println("\nChoose a person you would like to change the ID of: [1] Default [2] Anh Huynh");
        int choice = keyb.nextInt();
        
        if (choice == 1){
                setNewId(person1);
                id1 = person1.getId();
                System.out.printf("""

                %s's Updated ID
                Name: %s
                ID: %s
                """, name1, name1, id1);
        } else if (choice == 2) { 
                setNewId(person2);
                id2 = person2.getId();
                System.out.printf("""

                %s's Updated ID
                Name: %s
                ID: %s
                """, name2, name2, id2);
        }
        
        keyb.nextLine();

        // User Controlled Loop Prompt
        System.out.println("""


                Do you want to exit 
                the program? (Y/N)
                """);
         String answer = keyb.nextLine();
         userControl = answer.charAt(0);

      } while (userControl != 'Y' && userControl != 'y');
    }

    // The `setNewId` method in the `PayrollDemo` class is a helper method that allows the user to
    // input a new ID for a specific person (employee).
    public static void setNewId(Payroll person){
        Scanner keyb = new Scanner(System.in);
        System.out.println("\nPlease enter a new ID for " + person.getEmployeeName() + ": ");
        String newId = keyb.nextLine();
        person.setId(newId);
    }
}
