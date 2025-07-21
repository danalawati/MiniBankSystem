public class BankAccount {

    String accountName;
    String accountNumber;
    double balance;

    public BankAccount(String accountName,String accountNumber,double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }
    public void showAccountInfo(){

        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

