package Chapter3;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int status;
        double income, totalTaxes;
        // Single Filing % Categories
        double  a = (8350 * 0.10), 
                b = (33950 - 8350) * 0.15, 
                c = (82250 - 33950) * 0.25, 
                d = (171550 - 82250) * 0.28, 
                e = (372950 - 171550) * 0.33;
        
        // Married Filing Jointly or Qualified Widow(er) % Categories
        double  a1 = (16700 * 0.10),
                b1 = (67900 - 16700) * 0.15,
                c1 = (137050 - 67900) * 0.25,
                d1 = (208850 - 137050) * 0.28,
                e1 = (372950 - 208850) * 0.33;

        // Married Filing Separately % Categories
        double  a2 = (8350 * 0.10),
                b2 = (33950 - 8350) * 0.15,
                c2 = (68525 - 33950) * 0.25,
                d2 = (104425 - 68525) * 0.28,
                e2 = (186475 - 104425) * 0.33;


        // Head of Household % Categories
        double  a3 = (11950 * 0.10),
                b3 = (45500 - 11950) * 0.15,
                c3 = (117450 - 45500) * 0.25,
                d3 = (190200 - 117450) * 0.28,
                e3 = (372950 - 190200) * 0.33;

        

        System.out.println("\nWelcome to the Income Tax program, where your taxes are calculated based on filing status and taxable income. \nBefore we begin, we'll need some information.");
        System.out.println(""" 
                           \n\t\t\tFiling Status
                           \nEnter the number according to your filing status.
                           Single [0]\t Married Filing Jointly or Qualified Widow(er) [1] \t Married Filing Separately [2] \t Head of Household [3]""");
        status = keyb.nextInt();
        System.out.print("\nPlease enter your income: ");
        income = keyb.nextInt();
        System.out.printf("""
                \nIncome
                $%,.2f\n""", income);
        
        if (income >= 0) {
        switch(status){

            case 0:
                if (income < 8351){
                    totalTaxes = income * 0.10;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 33951) {
                    totalTaxes = a + (income - 8350) * 0.15;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 82251) {                                                            
                    totalTaxes = a + b + (income - 33950) * 0.25;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 171551){
                    totalTaxes = a + b + c + (income - 82250) * 0.28;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 372951) {
                    totalTaxes = a + b + c + d + (income - 171550) * 0.33;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else {
                    totalTaxes = a + b + c + d + e + (income - 372950) * 0.35;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                }
                break;

            case 1:
                if (income < 16701) {
                    totalTaxes = income * 0.10;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 67901){
                    totalTaxes = a1 + (income - 16700) * 0.15;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 137051) {
                    totalTaxes = a1 + b1 + (income - 67900) * 0.25;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 208851) {
                    totalTaxes = a1 + b1 + c1 + (income - 137050) * 0.28;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 372951) {
                    totalTaxes = a1 + b1 + c1 + d1 + (income - 208850) * 0.33;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else {
                    totalTaxes = a1 + b1 + c1 + d1 + e1 + (income - 372950) * 0.35;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                }
                break;

            case 2:
                if (income < 8351) {
                    totalTaxes = income * 0.10;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 33951) {
                    totalTaxes = a2 + (income - 8350) * 0.15;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 68526) {
                    totalTaxes = a2 + b2 + (income - 33950) * 0.25;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 104426) {
                    totalTaxes = a2 + b2 + c2 + (income - 68525) * 0.28;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 186476) {
                    totalTaxes = a2 + b2 + c2 + d2 + (income - 104425) * 0.33;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else {
                    totalTaxes = a2 + b2 + c2 + d2 + e2 + (income - 186475) * 0.35;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                }
                break;

            case 3:
                if (income < 11951) {
                    totalTaxes = income * 0.10;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 45501){
                    totalTaxes = a3 + (income - 11950) * 0.15;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 117451) {
                    totalTaxes = a3 + b3 + (income - 45500) * 0.25;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 190201) {
                    totalTaxes = a3 + b3 + c3 + (income - 117450) * 0.28;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else if (income < 372951) {
                    totalTaxes = a3 + b3 + c3 + d3 + (income - 190200) * 0.33;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                } else {
                    totalTaxes = a3 + b3 + c3 + d3 + e3 + (income - 372950) * 0.35;
                    System.out.printf("\nYou will be paying $%,.2f in taxes\n", totalTaxes);
                }
                break;

            default: 
                System.out.print("\nError: Invalid status. Please try again.\n");
        } 
        } else {
            System.out.println("\nPlease enter a valid income amount.");
        }
    }
}
