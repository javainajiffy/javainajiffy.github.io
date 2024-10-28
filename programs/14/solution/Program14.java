package com.javainajiffy;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		
		boolean showStandardAnswer = false;
		
		System.out.println("Enter total number of seconds: ");
		 
		Scanner s = new Scanner(System.in);
		int sec = s.nextInt();
		s.close();
		
		if (showStandardAnswer) {
			standardAnswer(sec);
		} else {
			extraCreditAnswer(sec);
		}
	}
	
	private static void standardAnswer(int inputSeconds) {
		if (inputSeconds < 0) {
			System.out.println("No negative numbers. Please run the program again.");
		} else if (inputSeconds < 60) {
			System.out.println(inputSeconds + " seconds equals " + inputSeconds + " seconds");
		} else if (inputSeconds < 3600) {
			double min = inputSeconds / 60.0;
			System.out.println(inputSeconds + " seconds equals " + min + " minutes");
		} else if (inputSeconds < 86400) {
			double hr = inputSeconds / 3600.0;
			System.out.println(inputSeconds + " seconds equals " + hr + " hours" );
		} else {
			double day = inputSeconds / 86400.0;
			System.out.println(inputSeconds + " seconds equals " + day  + " days" );												
		}
	}
	
	private static void extraCreditAnswer(int inputSeconds) {
		if (inputSeconds < 0) {
			System.out.println("No negative numbers. Please run the program again.");
			return;
		}
		int remainingSeconds = inputSeconds;
		int days = 0;
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		if (remainingSeconds >= 86400) {
			days = remainingSeconds / 86400;
			remainingSeconds = remainingSeconds - (days * 86400);
		}
		if (remainingSeconds >= 3600) {
			hours = remainingSeconds / 3600;
			remainingSeconds = remainingSeconds - (hours * 3600);
		}
		if (remainingSeconds >= 60) {
			minutes = remainingSeconds / 60;
			remainingSeconds = remainingSeconds - (minutes * 60);
		}
		if (remainingSeconds < 60) {
			seconds = remainingSeconds;
		}
		System.out.println(inputSeconds + " seconds equals " + days  + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");		
	}

}
