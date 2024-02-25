package com.javainajiffy;

public class Program11 {

	public static void main(String[] args) {
		NumberPair numberPair = new NumberPair(10, 2);
		System.out.println(numberPair.getNum1() + " + " + numberPair.getNum2() + " = " + numberPair.sum());
		System.out.println(numberPair.getNum1() + " - " + numberPair.getNum2() + " = " + numberPair.substract());
		System.out.println(numberPair.getNum1() + " * " + numberPair.getNum2() + " = " + numberPair.multiply());
		System.out.println(numberPair.getNum1() + " / " + numberPair.getNum2() + " = " + numberPair.divide());
	}

}
