
import java.util.Scanner;
public class MiniBankSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;


        while (true){
            Menu();
            System.out.println("Choose an option");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline here

            switch (choice) {
                case 1: // Create account
                    System.out.print("Enter account name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter account number: ");
                    String number = scanner.nextLine();

                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter interest rate (e.g. 0.05 for 5%): ");
                    double interestRate = scanner.nextDouble();
                    scanner.nextLine();

                    account = new SavingsAccount(name, number, balance, interestRate); // ✅ make it a SavingsAccount
                    System.out.println("Savings account created successfully!");
                    break;

                case 2: // Deposit money
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 3: // Withdraw money
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        scanner.nextLine();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 4: // View account details
                    if (account != null) {
                        account.showAccountInfo();
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        if (account instanceof SavingsAccount) {
                            ((SavingsAccount) account).ApplyInterest(); // ✅ cast to use child method
                        } else {
                            System.out.println("This account type does not support interest.");
                        }
                    } else {
                        System.out.println("No account found. Please create an account first.");
                    }
                    break;



                case 6: // Exit
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
            System.out.println(); // extra line for readability
        }

//        BankAccount acc1 = new BankAccount("A", "001",100);
//        BankAccount acc2= new BankAccount("B", "002",100);
//
//        acc1.showAccountInfo();
//        //System.out.println();
//        //acc2.showAccountInfo();


    }

    public static void Menu(){
        System.out.println("Option 1: Create a new account");
        System.out.println("Option 2: Deposit money");
        System.out.println("Option 3: Withdraw money");
        System.out.println("Option 4: View account details");
        System.out.println("Option 5: Intrest rate");
        System.out.println("Option 6: Exit");
    }
}