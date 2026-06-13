package com.tka;

public class MainInsurance {
public static void main(String[] args) {
	TermPolicy tm = new TermPolicy();
	tm.getInsuranceDetails();
	tm.getLifeInsuranceDetails();
	tm.getTermPolicyDetails();
	
	tm.getInsuranceInformation();
	tm.getLifeInsuranceInformation();
	tm.getTermPolicyInformation();
}
}