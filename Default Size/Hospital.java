package com.defaultsize;

public class Hospital {
static int hospital_ID = 1;
static String hospitalName = "City Hospital";
static String hospital_Location = "Pune";
static int totalBeds = 300;
static int totalStaff = 50;
static String hospitalType = "private";
static String patientName;       //New
static boolean admission_Stutus;
static double billAmount;

public static void main(String[] args) {
	System.out.println(hospital_ID);
	System.out.println(hospitalName);
	System.out.println(hospital_Location);
	System.out.println(totalBeds);
	System.out.println(totalStaff);
	System.out.println(hospitalType);
	System.out.println(patientName);
	System.out.println(admission_Stutus);
	System.out.println(billAmount);
}


}
