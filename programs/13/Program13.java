package com.javainajiffy;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter height of cylindrical fuel tank: ");
		double h = scanner.nextDouble();
		
		System.out.println("Enter radius of cylindrical fuel tank: ");
		double r = scanner.nextDouble();
		scanner.close();
		
		double pi = Math.PI;
		double v = pi * Math.pow(r, 2) * h;
		double surfaceArea = (2 * pi * r * h) + (2 * pi * Math.pow(r, 2));
		
		System.out.println("The volume of a cylindrical fuel tank ");
		System.out.println("with height, "  + h + ", and radius, " + r + ", is: " + v );
		System.out.println("\nThe surface area of a cylindrical fuel tank ");
		System.out.println("with height, "  + h + ", and radius, " + r + ", is: " + surfaceArea )
	}
}
