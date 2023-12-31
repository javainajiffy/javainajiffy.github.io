package com.javainajiffy;

public class Program8 {

	//https://www.ascii-code.com/
	//https://www.ssec.wisc.edu/~tomw/java/unicode.html
	//https://symbl.cc/en/unicode/table/
	public static void main(String[] args) {
		char var1 = 'z';
		char var2 = 'V';
		char result = (char) (var1 - var2);
		
		System.out.println("The first character is " + var1);
	   	System.out.println("The second character is " + var2);
	    	System.out.println(var1 + " - " + var2 + " equals " + result);
	}

}
