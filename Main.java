import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the ATM Interface!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Deposit Funds");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdrawFunds(scanner);
                    break;
                case 3:
                    depositFunds(scanner);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the ATM Interface!");
        scanner.close();
    }

    public void checkBalance() {
        double balance = account.getBalance();
        System.out.println("Your account balance: $" + balance);
    }

    public void withdrawFunds(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();

        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    public void depositFunds(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();

        account.deposit(amount);
        System.out.println("Deposit successful.");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial account balance
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
