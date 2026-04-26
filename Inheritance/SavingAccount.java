package inheritance;

public class SavingAccount extends BankAccount {
	float interestRate;

	public void Addinterest() {
		System.out.println("interest" + Balance + "is" + interestRate + "%" + "\n interest on  account is :"
				+ (Balance * interestRate / 100));
	}
}
