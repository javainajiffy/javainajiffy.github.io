package com.javainajiffy;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		boolean useNewSwitch = true;
		System.out.println("Enter a number between 1 and 10:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		if (useNewSwitch) {
			newSwitchStatement(num);
		} else {
			traditionalSwitchStatement(num);
		}

	}
	
	public static void traditionalSwitchStatement(int num) {
		String romanNumeral;
		
		switch (num) {
			case 1:
				romanNumeral = "I";
				break;
			case 2:
				romanNumeral = "II";
				break;
			case 3:
				romanNumeral = "III";
				break;
			case 4:
				romanNumeral = "IV";
				break;
			case 5:
				romanNumeral = "V";
				break;
			case 6:
				romanNumeral = "VI";
				break;
			case 7:
				romanNumeral = "VII";
				break;
			case 8:
				romanNumeral = "VIII";
				break;
			case 9:
				romanNumeral = "IX";
				break;
			case 10:
				romanNumeral = "X";
				break;	
			default:
				System.out.println("Invalid Input.");
				return;
		}

		System.out.print("The roman numeral version of " + num + " is: " + romanNumeral);
	}
	
	public static void newSwitchStatement(int num) {
			String romanNumeral = switch (num) {
		    case 1 -> "I";
		    case 2 -> "II";
		    case 3 -> "III";
		    case 4 -> "IV";
		    case 5 -> "V";
		    case 6 -> "VI";
		    case 7 -> "VII";
		    case 8 -> "VIII";
		    case 9 -> "IX";
		    case 10 -> "X";
		    default -> null;
		};
		if (romanNumeral == null) {
			System.out.println("Invalid Input.");
		} else {
			System.out.print("The roman numeral version of " + num + " is: " + romanNumeral);
		}
	}

}
