
package com.mycompany.bankdemo;


public class BankAccount {
    private String accountHolder;
   private double balance;
   // Constructor
   public BankAccount(String accountHolder, double balance) {
       this.accountHolder = accountHolder;
       this.balance = balance;
   }
   // Method to deposit money
   public void deposit(double amount) {
       if (amount > 0) {
           balance += amount;
           System.out.println("Depositing R" + amount);
       } else {
           System.out.println("Invalid deposit amount.");
       }
   }
   // Method to withdraw money
   public void withdraw(double amount) {
       if (amount <= balance) {
           balance -= amount;
           System.out.println("Withdrawing R" + amount);
       } else {
           System.out.println("Insufficient funds. Withdrawal failed.");
       }
   }
   // Method to display account details
   public void displayBalance() {
       System.out.println("Account Holder: " + accountHolder);
       System.out.println("Current Balance: R" + balance);
   }
}

