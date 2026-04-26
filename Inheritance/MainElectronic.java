package inheritance;

public class MainElectronic {
	public static void main(String[] args) {
		Electronic e = new Electronic();
		e.Name = "i phone 17 ";
		e.price = 120000;
		e.Warranty = 1 ;
		 
		e.displayProduct();
		e.ShowWarranty();
	}
}