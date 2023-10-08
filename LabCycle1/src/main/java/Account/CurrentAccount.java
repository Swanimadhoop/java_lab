/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author swani
 */
public class CurrentAccount extends Account {
    public CurrentAccount(String accountHolderName, long accountNumber, double balanceAmount) {
        super(accountHolderName, accountNumber, balanceAmount);
    }

    public void withdrawal(double amount) {
        double overdraftAmount = balanceAmount * 0.05;
        if (balanceAmount - amount >= overdraftAmount) {
            balanceAmount -= amount;
            System.out.println("Withdrawal  successful.");
            System.out.println("Remaining Balance: " + balanceAmount);
        } else {
            System.out.println("Insufficient balance to perform withdrawal.");
        }
    }
}