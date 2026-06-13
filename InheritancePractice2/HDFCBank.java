package com.tka;

public class HDFCBank extends Bank{
	double getCalculateInterest(double PrincipaleAmount, int tenure, float RateOfInterest) {
		return (PrincipaleAmount * tenure * RateOfInterest) / 100;
	}

	void getHDFCBankDetails() {

		System.out.println("HDFC BANK");
	}
}
