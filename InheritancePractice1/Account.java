package com.tka;

public class Account {
	int accountNumber;
	String accountName;

	void getAccountDetails() {
		accountNumber = 101202303;
		accountName = "Sarang";
	}

	void getAccountInformation() {
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Name :" + accountName);
	}

}
