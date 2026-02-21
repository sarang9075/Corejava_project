package com.opration;

public class BankMachine {
	public static void main(String[] args) {
		System.out.println("Welcome to SBI----->");
		System.out.println("-----------------------------------");
		double amount = 50000;
		System.out.println("check balance-->" + amount);
		double deposit = 20000;
		double totalAmount = amount + deposit;
		System.out.println("check balance after deposit" + deposit + "Amount--->+(total amount)");
		System.out.println("-----------------------------------------------------------------------");
		double withdraw = 65000;
		double remainAmount = totalAmount - withdraw;
		System.out.println("After withdraw remainnig Amt-->" + remainAmount);

	}

}
