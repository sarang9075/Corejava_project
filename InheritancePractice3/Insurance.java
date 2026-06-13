package com.tka;

public class Insurance {
	int id;
	String PersonName;
	String InsuranceCompany;
	void getInsuranceDetails() {
		 id = 101;
		 PersonName = "Sarang";
		 InsuranceCompany = "LIC";
	}
void	getInsuranceInformation(){
		System.out.println("Person ID:"+id);
		System.out.println("Person Name:"+PersonName);
		System.out.println("Insurance Company :"+InsuranceCompany);
	}

}
