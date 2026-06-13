package com.tka;

public class SbiBank extends Bank {
double getCalculateInterest(double PrincipaleAmount,int tenure,float RateOfInterest) {
	return (PrincipaleAmount * tenure * RateOfInterest)/100;
}

void getSbiBankDetails() {

	System.out.println("SBI BANK");
}
}
