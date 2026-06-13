package com.tka;

public class ICICIBank extends Bank{
	double getCalculateInterest(double PrincipaleAmount, int tenure, float RateOfInterest) {
	return (PrincipaleAmount * tenure * RateOfInterest)/100;
}
void getBankICICIDetails(){
	System.out.println("ICICI BANK");
}
}
