// Implement your SavingsAccount class in this file
public class SavingsAccount extends BankAccount {
    
    public boolean debit(int pennies){
        if (pennies <= super.currentBalance) {
            super.currentBalance = super.currentBalance - pennies;
            return true;
        } else {
            return false;
        }
    }

    public void applyInterest(){
        double interestAmount;

        if (super.currentBalance>0) {
            interestAmount = super.currentBalance*super.interestRate;
            super.currentBalance = super.currentBalance+(int)interestAmount;
        }
    }

    public String accountInfo(){
        
        String typeOfAccount = String.format("%-16s: Savings\n", "Type of Account");
        String accID = String.format("%-16s: %s\n", "Account ID", super.accountID);
        String currentBalance = String.format("%-16s: $%.2f\n", "Current Balance", (double)super.currentBalance/100);
        String interestRate = String.format("%-16s: %.2f%%\n", "Interest rate", super.interestRate*100);
        
        String r = typeOfAccount + accID + currentBalance + interestRate;
        
        return (r);
    }
}
