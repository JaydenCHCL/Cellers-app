package com.cellers.app;

public class BankingApp {

	int accountNo;
	String accountName;
	float amount;
	public static void main(String[] args) {
		BankingApp b1 = new BankingApp();
		b1.insertAccount(1234, "Jayden", 1000);
		b1.deposit(2000);
		b1.checkBalance();
		b1.withdraw(40000);
		b1.withdraw(400);
		b1.checkBalance();
	}
	
	void insertAccount(int accountNo, String accountName, float amount) {
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.amount = amount;
	}
	
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println("Deposited: $" + amount);
	}
	
	void withdraw(float amt) {
		if(amount < amt) {
			System.out.println("Insufficient Funds");
		}else {
			amount = amount - amt;
			System.out.println("Withdrew: $" + amt);
		}
	}
	
	void checkBalance() {
		System.out.println(accountName + " " + accountNo + ": $" + amount);
	}

}
