
public class MiniBankSystem {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("A", "001",100);
        BankAccount acc2= new BankAccount("B", "002",100);

        acc1.showAccountInfo();
        //System.out.println();
        //acc2.showAccountInfo();
        acc1.Withdraw(20);
        acc1.Deposit(10);
        acc1.Withdraw(100);

    }



    public static void Menu(){
        System.out.println("Option 1: Create a new account");
        System.out.println("Option 2: Deposit money");
        System.out.println("Option 3: Withdraw money");
        System.out.println("Option 4: View account details");
        System.out.println("Option 5: Exit");
    }
}