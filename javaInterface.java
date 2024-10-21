import java.util.Scanner;

// Account class to manage balance and transactions
class Account {
    private String accountNumber;
    private double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void reduceBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Payment Successful!");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Main class
public class javaInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an account with an initial balance
        System.out.println("        Welcome to Krishnammurthy Bank");
        
        // Enter Account Number
        String accountNumber;
        while (true) {
            System.out.print("Enter Your 10 Digit Account Number: ");
            accountNumber = sc.nextLine();
            // Validate account number (should be 10 digits)
            if (accountNumber.length() == 10 && accountNumber.matches("[0-9]+")) {
                break;
            } else {
                System.out.println("Invalid account number. Please enter a 10-digit numeric account number.");
            }
        }

        Account account = new Account(accountNumber, 10000.00); // Initial balance of 10,000

        System.out.println("your Balance: " + account.getBalance());

        // Get transaction details
        System.out.print("Enter IFSC Code of the receiver: ");
        String ifsc = sc.nextLine();  // Getting the IFSC code

        System.out.print("Enter the amount to send: ");
        double amount = sc.nextDouble();  // Getting the amount to deduct
        sc.nextLine();  // Consume the newline character after double input

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();  // Getting the PIN

        // Assuming a fixed PIN for this example (e.g., "1234")
        String correctPin = "1234";
        if (pin.equals(correctPin)) {
            // Process payment and reduce balance
            account.reduceBalance(amount);  // Deduct amount from balance
        } else {
            System.out.println("Incorrect PIN. Transaction aborted.");
        }

        sc.close();
    }
}
