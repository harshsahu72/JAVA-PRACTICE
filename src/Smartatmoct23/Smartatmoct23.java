package Smartatmoct23;

import java.util.Scanner;

class Account {
    private String accountHolder;
    private long accountNumber;
    private double balance;

    Account(String name, long number, double bal) {
        accountHolder = name;
        accountNumber = number;
        balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful!");
            System.out.println("New Balance: Rs. " + balance);
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter a valid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: Rs. " + balance);
        }
    }

    public void displayAccountType() {
        System.out.println("General Account");
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String name, long number, double bal) {
        super(name, number, bal);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

public class Smartatmoct23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SavingsAccount sa =
                new SavingsAccount("Harsh", 12345L, 5000);

        int choice;

        do {
            System.out.println("\n========== SMART ATM ==========");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        sa.displayAccountType();
                        sa.checkBalance();
                        break;

                    case 2:
                        try {
                            System.out.print("Enter deposit amount: ");
                            double amount = Double.parseDouble(sc.nextLine());
                            sa.deposit(amount);
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter numbers only.");
                        } finally {
                            System.out.println("Deposit attempt completed.");
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Enter withdrawal amount: ");
                            double amount = Double.parseDouble(sc.nextLine());
                            sa.withdraw(amount);
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter numbers only.");
                        } finally {
                            System.out.println("Withdrawal attempt completed.");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using Smart ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice! Select 1 to 4.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a numeric menu choice.");
                choice = 0;
            } finally {
                System.out.println("ATM operation finished.");
            }

        } while (choice != 4);

        sc.close();
    }
}