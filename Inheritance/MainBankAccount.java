package inheritance;

public class MainBankAccount {
	public static void main(String[] args) {
		SavingAccount s = new SavingAccount();
		s.Name = "Sarang";
		s.Balance = 100000;
		s.interestRate = 2;
		s.deposite(15000);
		s.withdraw(30000);
		s.Addinterest();
	}
}
