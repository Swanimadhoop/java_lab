/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;

/**
 *
 * @author swani
 */
public class SavingsAccount extends Account {
    final double MINIMUM_BALANCE = 1000;

    public SavingsAccount(String accountHolderName, long accountNumber, double balanceAmount) {
        super(accountHolderName, accountNumber, balanceAmount);
    }

    @Override
    public void withdrawal(double amount) {
        if (balanceAmount - amount >= MINIMUM_BALANCE) {
            balanceAmount -= amount;
            System.out.println("Withdrawal of successful.");
            System.out.println("Remaining Balance: " + balanceAmount);
        } else {
            System.out.println("Insufficient balance to perform withdrawal.");
        }
    }
}