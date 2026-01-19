package com.bank.model;

public class Account {
	private int accNo;
	private String holderName;
	private double balance;
	
	public Account(int accNo, String holderName, double balance) {
		super();
		this.accNo = accNo;
		this.holderName = holderName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

