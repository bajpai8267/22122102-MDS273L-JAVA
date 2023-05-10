import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;
    private ArrayList<String> transactions;
    
    public Lab4(String accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<String>();
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            this.transactions.add("Deposit: " + amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.accountBalance) {
            this.accountBalance -= amount;
            this.transactions.add("Withdraw: " + amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }
    
    public void printTransactions() {
        if (this.transactions.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transactions:");
            for (String transaction : this.transactions) {
                System.out.println(transaction);
            }
        }
    }
    
    public void printAccountSummary() {
        System.out.println("Account Summary:");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Balance: " + this.accountBalance);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        
        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();
        
        System.out.println("Enter account balance:");
        double accountBalance = scanner.nextDouble();
        
        Lab4 bankAccount = new Lab4(accountNumber, accountHolderName, accountBalance);
        
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            System.out.println("0. Exit");
            System.out.println("Enter choice:");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    bankAccount.printTransactions();
                    break;
                case 4:
                    bankAccount.printAccountSummary();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
        
        scanner.close();
    }
}