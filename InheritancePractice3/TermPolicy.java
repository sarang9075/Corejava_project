package com.tka;

public class TermPolicy extends LifeInsurance {
int duration;
void getTermPolicyDetails() {
	duration = 20;
}
void getTermPolicyInformation() {
	System.out.println("Duration:"+duration+"Years");
}
}
