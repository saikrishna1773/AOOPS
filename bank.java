package com.bank;

public class bank {
	public static void main(String[] args) {
        Manager loginManager = Manager.getInstance();
        bankaccount account = new bankaccount(1000.00);
        account.viewBalance();
        loginManager.login("Soumith ");
        account.viewBalance();
        account.deposit(200.00);
        account.withdraw(150.00);
        account.viewBalance();
        loginManager.logout();
        account.viewBalance();
        account.deposit(100.00);
        account.withdraw(50.00);
    }
}
