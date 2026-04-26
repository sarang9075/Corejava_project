package com.jbk;

public class MainBank {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setBalance(10000);
		b.setDeposite(10000);
		b.setWithdraw(10000);
		System.out.println("The current balance"   +    b.getBalance());
		System.out.println("The deposite balance"   +   b.getDeposite());
		System.out.println("The current balance after withdraw"   +   b.getWithdraw());

	}

}
