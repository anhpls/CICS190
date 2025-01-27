public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit)
    {
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0);
    }  

    public Money getBalance()
    {
        return new Money(balance);
    }

    public Money getCreditLimit()
    {
        return new Money(creditLimit);
    }

    public String getPersonals()
    {
        return owner.toString();
    }

    public void charge (Money amt)
    {
        Money newBalance = balance.add(amt);
        if (newBalance.compareTo(creditLimit) <= 0)
        {
            balance = newBalance;
            System.out.println("Charge: " + amt);
        } else  {
            System.out.println("Exceeds credit limit.");
        }
    }

    public void payment(Money amt)
    {
        balance = balance.subtract(amt);
    }
}
