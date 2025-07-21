public class BankAccount {

    String accountName;
    String accountNumber;
    double balance;

//constructor
    public BankAccount(String accountName,String accountNumber,double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;

    }

    //method ShowAccountInfo
    public void showAccountInfo(){

        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount+ " New balance:" + balance);
        } else {
            System.out.println("Amount should be positive");
        }

    }
    public void withdraw (double amount){
        if (amount > 0 && amount <= balance){
            balance -=amount;
            System.out.println("Withdrew: " + amount+ " New balance:" + balance);
        } else {
            System.out.println("Please try again");
        }
    }

}

