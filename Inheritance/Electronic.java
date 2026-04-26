package inheritance;

public class Electronic extends Product {
	int Warranty;
	public  void ShowWarranty() {
		System.out.println("Warranty:" + Warranty + "yrs");
	}
}
