import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, int accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current Balance: " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. Current Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Current Balance: " + balance);
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("\nAccount Details:");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for account creation
        System.out.println("Create Account:");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating the account
        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        // Performing deposit and withdrawal
        System.out.print("\nDeposit Amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nWithdraw Amount: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        // Displaying final account details
        account.displayAccount();

        scanner.close();
    }
}
