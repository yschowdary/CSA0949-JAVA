import java.util.Scanner;

class BankAccount {
    // Data members
    private String depositorName;
    private String accountNumber;
    private String accountType; // Savings or Current
    private double balance;

    // Constructor to initialize the account with a default balance
    public BankAccount() {
        this.balance = 10000.00; // Initial balance
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextLine();
        System.out.print("Enter Depositor Name: ");
        depositorName = scanner.nextLine();
        System.out.print("Enter Account Type (Savings/Current): ");
        accountType = scanner.nextLine();
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= 500) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            System.out.println("Insufficient balance! Minimum balance of Rs. 500 must be maintained.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

// Main class to test the BankAccount functionality
public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(); // Create a bank account instance

        // Read account details
        account.readAccountDetails();

        // Display initial balance
        account.displayBalance();

        // Deposit amount
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        account.displayBalance();

        // Withdraw amount
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();
    }
}
