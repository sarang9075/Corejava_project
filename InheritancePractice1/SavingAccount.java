package com.tka;

public class SavingAccount extends Account{
	String AccountType;
	Long Balance;

	void getSavingAccountDetails() {
		AccountType = "Saving";
		Balance = 20000L;
	}

	void SavingAccountInformation() {
		System.out.println("Account type :" + AccountType);
		System.out.println("Account Balance :" + Balance);
	}
}
