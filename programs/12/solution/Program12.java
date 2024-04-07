package com.javainajiffy;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		System.out.println("Enter weight in pounds: ");

		Scanner s = new Scanner(System.in);
		double pounds = s.nextDouble();
		s.close();
		
		double kilograms = pounds / 2.21;
	
		System.out.println("Weight in kilograms: " + kilograms);
	}

}
