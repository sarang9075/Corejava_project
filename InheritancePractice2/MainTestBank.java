package com.tka;

public class MainTestBank {
	public static void main(String[] args) {
		ICICIBank ic = new ICICIBank();
		ic.getBankICICIDetails();
		System.out.println("Interest" + ic.getCalculateInterest(100000, 2, 5));

		SbiBank sb = new SbiBank();
		sb.getSbiBankDetails();
		System.out.println("Interest" + sb.getCalculateInterest(100000, 2, 6));

		HDFCBank Hd = new HDFCBank();
		Hd.getHDFCBankDetails();
		System.out.println("Interest" + Hd.getCalculateInterest(100000, 2, 7));
	}
}
