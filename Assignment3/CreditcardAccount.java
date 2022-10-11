public class CreditcardAccount extends BankAccount {
    private int limit = 0;

    public boolean debit(int pennies) {
        
        if (pennies>limit) {
            return false;
        } else {
            super.currentBalance = super.currentBalance - pennies;
            return true;
        }
    }

    public void setLimit(int creditLimit) {
        this.limit = creditLimit;
    }

    public int getLimit() {
        return limit;
    }

    public void applyInterest() {
        double interestAmount;

        if (super.currentBalance<0) {
            interestAmount = super.currentBalance*super.interestRate;
            super.currentBalance = super.currentBalance+(int)interestAmount;
        }
    }

    public String accountInfo() {
        String typeOfAccount = String.format("%-16s: Creditcard\n", "Type of Account");
        String accID = String.format("%-16s: %s\n", "Account ID", super.accountID);
        String currentBalance = String.format("%-16s: $%.2f\n", "Current Balance", -(double)super.currentBalance/100);
        String interestRate = String.format("%-16s: %.2f%%\n", "Interest rate", super.interestRate*100);
        String cardLimit = String.format("%-16s: $%.2f\n", "Credit Limit", (double)limit/100);
        
        String r = typeOfAccount + accID + currentBalance + interestRate + cardLimit;
        
        return (r);
    }
}
