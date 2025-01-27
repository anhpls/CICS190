/**
   This class represents nonnegative amounts of money.
*/

public class Money
{
   // The number of dollars
   private long dollars;

   // The number of cents
   private long cents;

   /**
      Constructor
      @param amount The amount in decimal format.
   */

   public Money(double amount)
   {
      if (amount < 0)
      {
         System.out.println("Error: Negative amounts " +
                            "of money are not allowed.");
         System.exit(0);
      }
      else
      {
         long allCents = Math.round(amount * 100);
         dollars = allCents / 100;
         cents = allCents % 100;
      }
   }

   // ADD LINES FOR TASK #1 HERE
   public Money(Money otherMoney)
   {
      this.dollars = otherMoney.dollars;
      this.cents = otherMoney.cents;
   };

   /**
      The add method
      @param otherAmount The amount of money to add.
      @return The sum of the calling Money object
              and the parameter Money object.
   */

   public Money add(Money otherAmount)
   {
      Money sum = new Money(0);

      sum.cents = this.cents + otherAmount.cents;

      long carryDollars = sum.cents / 100;

      sum.cents = sum.cents % 100;

      sum.dollars = this.dollars +
                    otherAmount.dollars +
                    carryDollars;

      return sum;
   }

   /**
      The subtract method
      @param amount The amount of money to subtract.
      @return The difference between the calling Money
              object and the parameter Money object.
   */

   public Money subtract (Money amount)
   {
      Money difference = new Money(0);

      if (this.cents < amount.cents)
      {
         this.dollars = this.dollars - 1;
         this.cents = this.cents + 100;
      }

      difference.dollars = this.dollars - amount.dollars;
      difference.cents = this.cents - amount.cents;

      return difference;
   }

   /**
      The compareTo method
      @param amount The amount of money to compare against.
      @return -1 if the dollars and the cents of the
   *  calling object are less than the dollars and
   *  the cents of the parameter object.
   *  0 if the dollars and the cents of the calling
   *  object are equal to the dollars and cents of
   *  the parameter object.
   *  1 if the dollars and the cents of the calling
   *  object are more than the dollars and the
   *  cents of the parameter object.
   */

   public int compareTo(Money amount)
   {
      int value;

      if(this.dollars < amount.dollars)
         value = -1;
      else if (this.dollars > amount.dollars)
         value = 1;
      else if (this.cents < amount.cents)
         value = -1;
      else if (this.cents > amount.cents)
         value = 1;
      else
         value = 0;

      return value;
   }

   // ADD LINES FOR TASK #2 HERE
   /**
    * The equals method checks if the dollars and cents of two Money objects are equal.
    * 
    * @param otherMoney The `otherMoney` parameter is an object of type `Money` that is being compared
    * to the current `Money` object to check if they are equal in terms of dollars and cents. 
    * @return The method returns a boolean value determined by whether the dollars and
    * cents of the current Money object are equal to the dollars and cents of the other Money object
    * passed as a parameter.
    */
   public boolean equals(Money otherMoney)
   {
      return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
   }

   /**
    * The toString method returns a formatted string representing dollars and cents.
    * @return The `toString()` method is returning a formatted string representing a monetary value
    * with dollars and cents.
    */
   
   public String toString()
   {
      return String.format("$%d.%02d", dollars, cents);
   }
}