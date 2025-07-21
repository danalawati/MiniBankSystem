public class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountName, String accountNumber, double balance, double interestRate) {
        super(accountName, accountNumber, balance); // reuse constructor from BankAccount
        this.interestRate = interestRate;
    }
    public void ApplyInterest(){
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: " + interest + " New balance: " + balance);
    }
}
