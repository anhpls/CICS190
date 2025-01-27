/**
 * The `Payroll` class represents an employee's payroll information and includes methods to
 * calculate gross pay, access and modify employee details, and give raises based on a specified
 * percentage.
 */

public class Payroll {
    public static void main(String[] args) {
        
    }

    private String employeeName = "";
    private String id = "";
    private double hourlyPay = 0;
    private double hoursWorked = 0;
    

    /*  Two Constructor Classes: 
    1) No Params 
    2) Name and ID */

    public Payroll(){
        employeeName = "Default User";
        id = "0001";
        hourlyPay = 16.50;
        hoursWorked = 24;
    }
    
    
    
    public Payroll(String name, String idNum){
        employeeName = name;
        id = idNum;
    }
    
    

    // Accessor Methods
    /**
     * The function calculates the gross pay based on the hours worked and hourly pay rate, applying
     * overtime pay for hours worked over 40.
     * 
     * @return The `getGrossPay` method returns the gross pay calculated based on the number of hours
     * worked and the hourly pay rate. If the hours worked are more than 40, overtime pay is calculated
     * at 1.5 times the hourly rate for hours worked beyond 40. Otherwise, the gross pay is calculated
     * by multiplying the hours worked by the hourly pay rate.
     */
    public double getGrossPay(){
        double grossPay;
        if (hoursWorked > 40){
            grossPay = ((hoursWorked - 40) * (hourlyPay * 1.5)) + (40 * hourlyPay); // ((50 - 40) * (hrly * 1.5)) + (40 * hrlypay) 
        } else {
            grossPay = hoursWorked * hourlyPay; 
        }
        return grossPay;
    }

    /**
     * The function getEmployeeName() returns the name of the employee.
     * 
     * @return The method `getEmployeeName()` is returning the value of the `employeeName` variable.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * The function getId() in Java returns the value of the id variable as a String.
     * 
     * @return The method `getId()` is returning the value of the variable `id`.
     */
    public String getId(){
        return id;
    }

    /**
     * The function `getHourlyPay` returns the hourly pay of an employee.
     * 
     * @return The method `getHourlyPay` is returning the value of the `hourlyPay` variable, which is a
     * double representing the hourly pay rate.
     */
    public double getHourlyPay(){
        return hourlyPay;
    }

    /**
     * The function "getHoursWorked" returns the number of hours worked.
     * 
     * @return The method `getHoursWorked` is returning the value of the variable `hoursWorked`, which
     * is of type `double`.
     */
    public double getHoursWorked(){
        return hoursWorked;
    }

    // Mutator Methods 
    /**
     * The function `setName` sets the name of an employee.
     * 
     * @param name The parameter `name` is a `String` type parameter that represents the name of an
     * employee.
     */
    public void setName(String name){
        employeeName = name;
    }

    /**
     * This function sets the value of the "id" variable to the provided idString.
     * 
     * @param idString A String value that represents the ID to be set for an object.
     */
    public void setId(String idString){
        id = idString;
    }

    /**
     * The function setHourlyPay in Java sets the hourly pay rate to the specified value.
     * 
     * @param payRate The parameter `payRate` is a double value representing the hourly pay rate that
     * you want to set for an employee.
     */
    public void setHourlyPay(double payRate){
        hourlyPay = payRate;
    }

    /**
     * The function setHoursWorked(double hours) sets the hours worked to the input value.
     * 
     * @param hours The parameter `hours` in the `setHoursWorked` method is a double value representing
     * the number of hours worked.
     */
    public void setHoursWorked(double hours){
        hoursWorked = hours;
    }

   /**
    * The function "giveRaise" increases the hourly pay by a specified percentage.
    * 
    * @param percent The `percent` parameter in the `giveRaise` method represents the percentage by
    * which the hourly pay should be increased.
    */
    public void giveRaise(double percent){
        hourlyPay = ((hourlyPay * percent)/100) + hourlyPay;
    }
}
