//Question: Write a Java program to simulate a real-life ATM withdrawal system using all five exception-handling keywords: try, catch, finally, throw, and throws.
//Requirements:
//Assume the bank account has an initial balance of ₹5,000.
//Ask the user to enter the amount they want to withdraw.
//Create a method named withdraw() that accepts the account balance and withdrawal amount.
//Use throw to generate an exception if the withdrawal amount is less than or equal to zero or exceeds the available balance.
//Use throws in the method declaration to declare the exception.
//Use try-catch to handle the exception and display an appropriate error message.
//Use finally to display "Thank you for using our ATM!" regardless of whether the withdrawal succeeds or fails.
//If the withdrawal is successful, display the withdrawn amount and the remaining account balance.
package ATM29oct;

import java.util.Scanner;

class Account {
    String name;
    long accountNumber;
    double balance;

    // Constructor
    Account(String name, long accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to withdraw money
    double withdraw(double balance, double amount) throws Exception {

        if (amount <= 0) {
            throw new Exception("Withdrawal amount must be greater than zero!");
        }

        if (amount > balance) {
            throw new Exception("Insufficient balance!");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful!");
        System.out.println("Withdrawn Amount: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + balance);

        return balance;
    }
}

public class ATM29oct {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a = new Account("Harsh", 2000000, 5000);

        System.out.println("===== ATM WITHDRAWAL SYSTEM =====");
        System.out.println("Account Holder: " + a.name);
        System.out.println("Account Number: " + a.accountNumber);
        System.out.println("Available Balance: ₹" + a.balance);

        System.out.print("Enter withdrawal amount: ₹");
        double amount = sc.nextDouble();

        try {
            a.balance = a.withdraw(a.balance, amount);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using our ATM!");
            sc.close();
        }
    }
}
