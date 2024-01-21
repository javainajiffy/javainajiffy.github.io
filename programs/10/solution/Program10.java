package com.javainajiffy;

public class Program10 {

	public static void main(String[] args) {
		double payAmount = 1750.25;
		int payPeriods = 26;
		double yearlyPay = payAmount * payPeriods;

		System.out.println("An employee earning $" + payAmount 
				+ " for " + payPeriods + " periods will earn $" + yearlyPay
				+ " each year.");
	}

}
