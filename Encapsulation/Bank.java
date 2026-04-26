package com.jbk;

public class Bank {
	private double Balance;
	private double Deposite;
	private double Withdraw;

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double Balance) {
		this.Balance = Balance;
	}

	public double getDeposite() {
		return Deposite;
	}

	public void setDeposite(double Deposite) {
		this.Balance = Deposite;
	}

	public double getWithdraw() {
		return Withdraw;
	}

	public void setWithdraw(double Withdraw) {
		this.Balance = Balance - Withdraw;
	}
}
