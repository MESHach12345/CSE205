public abstract class BankAccount {
    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int currentBalance = 0;

    public boolean credit(int pennies) {
        currentBalance = currentBalance + pennies;
        return true;
    }

    public abstract boolean debit(int pennies);

    public int getBalance(){
        return currentBalance;
    }

    public String getAccountID(){
        return accountID;
    }

    public void setAccountID(String accountID){
        this.accountID = accountID;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public abstract void applyInterest();

    public abstract String accountInfo();
}