package com.cellers.JavaDay3;

public class Bank {

	double balance;

	public double deposit(double amount, double bal) {
		this.balance = bal + amount;
		return balance;
	}

	public double withdraw(double amount, double bal) {
		if (balance >= amount) {
			this.balance = 0;
			return 0;
		} else {
			this.balance = bal - amount;
			return balance;
		}
	}

}
