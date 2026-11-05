/* ATM transaction System Banking Software.
1. Create a program to deposit and withdraw money.
2. Handle insufficient balance using exception handling.
3. Save every transaction in transactions.txt.
4. Display all previous transactions by reading the file.
Implement:
i. Check amount balance.
ii. Deposit money.
iii. Withdraw money.
iv. Handle insufficient balance using exception Handling.
v. save every transaction in transacitons.txt
vi. Display previous transactions from the file.

 */



package ATMNov5;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {

    double balance = 1000.0;

    // Check Balance
    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    // Save Transaction in File
    void saveTransaction(String transaction) throws IOException {

        FileWriter fw = new FileWriter("transactions.txt", true);

        fw.write(transaction + "\n");
        fw.close();
    }

    // Deposit Money
    void deposit(double amount) throws IOException {

        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
            return;
        }

        balance += amount;

        System.out.println("Amount deposited successfully!");
        checkBalance();

        saveTransaction(
                LocalDateTime.now() +
                        " | Deposited: Rs. " + amount +
                        " | Balance: Rs. " + balance
        );
    }

    // Withdraw Money
    void withdraw(double amount)
            throws InsufficientBalanceException, IOException {

        if (amount <= 0) {
            System.out.println("Enter a valid amount!");
            return;
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance! Transaction Failed."
            );
        }

        balance -= amount;

        System.out.println("Amount withdrawn successfully!");
        checkBalance();

        saveTransaction(
                LocalDateTime.now() +
                        " | Withdrawn: Rs. " + amount +
                        " | Balance: Rs. " + balance
        );
    }

    // Display Transaction History
    void displayTransactions() {

        try {
            File file = new File("transactions.txt");

            if (!file.exists()) {
                System.out.println("No previous transactions found.");
                return;
            }

            BufferedReader br = new BufferedReader(
                    new FileReader(file)
            );

            String line;

            System.out.println("\n----- TRANSACTION HISTORY -----");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading transaction file.");
        }
    }
}

public class ATMNov5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        int choice = 0;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();

                        atm.deposit(deposit);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();

                        try {
                            atm.withdraw(withdraw);

                        } catch (InsufficientBalanceException e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                        break;

                    case 4:
                        atm.displayTransactions();
                        break;

                    case 5:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {

                System.out.println("Please enter a valid number!");
                sc.nextLine();

            } catch (IOException e) {

                System.out.println("File operation failed!");
            }

        } while (choice != 5);

        sc.close();
    }
}
