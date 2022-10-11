public class CheckingAccount extends BankAccount {
    private int overdraftFee = 0;

    public boolean debit(int pennies) {
        if (super.currentBalance >= pennies) {
            super.currentBalance = currentBalance-pennies;
        } else {
            super.currentBalance = currentBalance - pennies - overdraftFee;
        }

        return true;
    }

    public void setFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public int getFee() {
        return overdraftFee;
    }

    public void applyInterest() {
        double interestAmount;

        if (super.currentBalance>0) {
            interestAmount = super.currentBalance*super.interestRate;
            super.currentBalance = super.currentBalance+(int)interestAmount;
        }
    }

    public String accountInfo() {
        String typeOfAccount = String.format("%-16s: Checking\n", "Type of Account");
        String accID = String.format("%-16s: %s\n", "Account ID", super.accountID);
        String currentBalance = String.format("%-16s: $%.2f\n", "Current Balance", (double)super.currentBalance/100);
        String interestRate = String.format("%-16s: %.2f%%\n", "Interest rate", super.interestRate*100);
        String overdraft = String.format("%-16s: $%.2f\n", "Overdraft Fee", (double)overdraftFee/100);
        
        String r = typeOfAccount + accID + currentBalance + interestRate + overdraft;
        
        return (r);
    }
}