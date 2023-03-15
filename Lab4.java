import java.util.ArrayList;
import java.util.Scanner;
    
public class Lab4 {
    private static String accountNumber;
    private static String accountHolderName;
private static double accountBalance;
private static ArrayList<String> transactions = new ArrayList<>();

public static void main(String[] args) {
initializeCustomer();
displayMenu();
}

private static void initializeCustomer() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter account number: ");
accountNumber = scanner.nextLine();
System.out.println("Enter account holder name: ");
accountHolderName = scanner.nextLine();
System.out.println("Enter account balance: ");
accountBalance = scanner.nextDouble();
}

private static void depositMoney() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter amount to deposit: ");
double amount = scanner.nextDouble();
accountBalance += amount;
String transaction = String.format("Deposited Rs%.2f", amount);
transactions.add(transaction);
System.out.println("Deposit successful.");
}

private static void withdrawMoney() {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter amount to withdraw: ");
double amount = scanner.nextDouble();
if (accountBalance >= amount) {
accountBalance -= amount;
String transaction = String.format("Withdrew Rs%.2f", amount);
transactions.add(transaction);
System.out.println("Withdrawal successful.");
} else {
System.out.println("Insufficient funds.");
}
}

private static void printTransactions() {
for (String transaction : transactions) {
System.out.println(transaction);
}
}

private static void printAccountSummary() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Holder Name: " + accountHolderName);
System.out.println("Account Balance: Rs" + accountBalance);
}

private static void displayMenu() {
Scanner scanner = new Scanner(System.in);
boolean exit = false;
while (!exit) {
System.out.println("\nSelect an option:");
System.out.println("1. Deposit Money");
System.out.println("2. Withdraw Money");
System.out.println("3. Print Transactions");
System.out.println("4. Print Account Summary");
System.out.println("5. Exit");
int choice = scanner.nextInt();
switch (choice) {
case 1:
depositMoney();
break;
case 2:
withdrawMoney();
break;
case 3:
printTransactions();
break;
case 4:
printAccountSummary();
break;
case 5:
exit = true;
}
}
}
}
