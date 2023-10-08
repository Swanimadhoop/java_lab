/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Account;
import java.util.Scanner;

/**
 *
 * @author swani
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account number: ");
        long accountNumber = scanner.nextLong();
        
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        
        System.out.print("Enter account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();
        
        Account account;
        
        if (accountType == 1) {
            account = new SavingsAccount(name, accountNumber, balance);
        } else {
            account = new CurrentAccount(name, accountNumber, balance);
        }
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdrawal(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
        
