package com.bank;

public class bankaccount {
	 private double balance;
	    public bankaccount(double initialBalance) {
	        this.balance = initialBalance;
	    }
	    public void viewBalance() {
	        if (Manager.getInstance().isLoggedin()) {
	            System.out.println("Current balance: $" + balance);
	        } else {
	            System.out.println("Please log in to view balance.");
	        }
	    }
	    public void deposit(double amount) {
	        if (Manager.getInstance().isLoggedin()) {
	            if (amount > 0) {
	                balance += amount;
	                System.out.println("Deposited $" + amount + ". New balance: $" + balance);
	            } else {
	                System.out.println("Deposit amount must be positive.");
	            }
	        } else {
	            System.out.println("Please log in to deposit money.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (Manager.getInstance().isLoggedin()) {
	            if (amount > 0 && amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrew $" + amount + ". New balance: $" + balance);
	            } else if (amount > balance) {
	                System.out.println("Insufficient funds.");
	            } else {
	                System.out.println("Withdrawal amount must be positive.");
	            }
	        } else {
	            System.out.println("Please log in to withdraw money.");
	        }
	    }
}
