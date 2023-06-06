package pack;
import java.util.Scanner;

public class BankAccount {
    private static double balance = 5000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.println("Current Balance: " + balance);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    withdrawMoney(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using the ATM!");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.println("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (balance - amount < 1000) {
            System.out.println("Minimum balance requirement not met!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Remaining balance: " + balance);
        }
    }

    private static void depositMoney(Scanner scanner) {
        System.out.println("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Deposit successful!");
        System.out.println("Updated balance: " + balance);
    }
}

