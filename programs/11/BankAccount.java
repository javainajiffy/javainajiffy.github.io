package com.javainajiffy;

public class BankAccount {
	
	private int accountNumber;
	private double balance;
	private String ownerName;
	
	public BankAccount(int accountNumber, String ownerName) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = 0;
	}

	
	public double addToBalance(double amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}
}
