/*Design a class to represent account, include the following members. Data member: Name of depositor, 
Account number, Type of account, banlanceMethod: 
i)  To assign intial values (using constructor).
ii)  To deposit an amount after checking balance and minimum balance is 1000 Rp. 
iii)  To Display name and balance. */
import java.util.Scanner;

public class l2_pro8 {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Constructor to initialize the account
    public l2_pro8(String depositorName, String accountNumber, String accountType, double initialBalance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        balance = initialBalance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }

        if (amount >= 1000) {
            balance += amount;
            System.out.println("Deposit successful. New balance :: " + balance);
        } else {
            System.out.println("Deposit failed. Minimum deposit amount is 1000 Rp.");
        }
    }

    // Method to display name and balance
    public void display() {
        System.out.println("Depositor Name :: " + depositorName);
        System.out.println("Account Number :: " + accountNumber);
        System.out.println("Account Type :: " + accountType);
        System.out.println("Balance :: " + balance);
    }

    public static void main(String[] args) 
    {
        System.out.println("Name :- Vadariya Shrey M.");
        System.out.println("Er. No.:- 220130318054");
        Scanner get = new Scanner(System.in);
        
        System.out.print("Enter the depositor's name :: ");
        String name = get.nextLine();
        
        System.out.print("Enter the account number :: ");
        String accountNumber = get.nextLine();
        
        System.out.print("Enter the account type :: ");
        String accountType = get.nextLine();
        
        System.out.print("Enter the initial balance :: ");
        double initialBalance = get.nextDouble();

        l2_pro8 account = new l2_pro8(name, accountNumber, accountType, initialBalance);
        account.display();

        System.out.print("Enter the amount to deposit :: ");
        double amount = get.nextDouble();
        account.deposit(amount);

        account.display();

        get.close();
    }
}
