package com.tka;

public class LifeInsurance extends Insurance {
	int PremiumAmount;

	void getLifeInsuranceDetails() {
		PremiumAmount = 50000;
	}

	void getLifeInsuranceInformation() {
		System.out.println("Premium Amount :" + PremiumAmount);
	}
}
