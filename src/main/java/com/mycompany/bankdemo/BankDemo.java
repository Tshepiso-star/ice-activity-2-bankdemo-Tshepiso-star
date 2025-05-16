
package com.mycompany.bankdemo;


public class BankDemo {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Bob The Builder", 1500.0);
       
       System.out.println("Initial Balance: R1500.0");
       
       account.deposit(200.0);
       account.displayBalance();
       
       account.withdraw(45250.0);
       account.displayBalance();
   }
}
