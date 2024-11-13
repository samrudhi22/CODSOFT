package com.solution.main;
import java.util.Scanner;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Amount has been Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdraw successfull: " + amount);
     } else {
         System.out.println(amount > balance ? "Insufficient balance." : "Invalid withdrawal amount.");
     }
 }
}

//Main ATM class with menu
public class AtmInterface {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     BankAccount account = new BankAccount(500.0); // Initial balance of $500

     while (true) {
         System.out.println("\n------------------*****WELCOME TO BANK ATM*****---------------------------");
         System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
         System.out.print("Please choose Service: ");
         System.out.println("\n--------------------------------------------------------------------------");
         int choice = scanner.nextInt();

         if (choice == 1) {
             System.out.println("Balance: " + account.getBalance());
         } else if (choice == 2) {
             System.out.print("Enter amount to deposit: ");
             account.deposit(scanner.nextDouble());
         } else if (choice == 3) {
             System.out.print("Enter amount to withdraw: ");
             account.withdraw(scanner.nextDouble());
         } else if (choice == 4) {
        	 System.out.println("\n--------------------------------------------------------------------------");
             System.out.println("Thank you for using the ATM!!!");
             break;
         } else {
             System.out.println("Invalid choice. Please try again.");
         }
     }
     scanner.close();
 }
}

