public class SavingsAccount extends BankAccount {
    private static final double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount){
        super(name, amount);
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    

    public void postInterest(){
        double monthly = getBalance() * (rate / 12);
        deposit(monthly);
    }

    @Override
    public String getAccountNumber(){
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount){
        super(oldAccount, amount);
        this.savingsNumber = oldAccount.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }
}
