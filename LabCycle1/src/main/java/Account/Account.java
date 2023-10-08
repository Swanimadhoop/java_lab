/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Account;
import java.util.Scanner;

/**
 *
 * @author swani
 */
public abstract class Account {
    String accountHolderName;
    long accountNumber;
    double balanceAmount;

    public Account(String accountHolderName, long accountNumber, double balanceAmount) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balanceAmount = balanceAmount;
    }

    public void deposit(double amount) {
        balanceAmount += amount;
        System.out.println(" Amount successfully deposited: " );
        System.out.println("Current Balance: " + balanceAmount);
    }

    public abstract void withdrawal(double amount);
}





