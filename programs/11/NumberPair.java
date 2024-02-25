package com.javainajiffy;

public class NumberPair {

	//Variables / Fields
	private double num1;
	private double num2;
	

	//Constructor
	public NumberPair(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	

	//Methods
	public double sum() {
		return num1 + num2;
	}

	public double substract() {
		return num1 - num2;
	}
	
	public double multiply() {
		return num1 * num2;
	}
	
	public double divide() {
		return num1 / num2;
	}
	
	public double getNum1() {
		return this.num1;
	}
	
	public double getNum2() {
		return this.num2;
	}
}
