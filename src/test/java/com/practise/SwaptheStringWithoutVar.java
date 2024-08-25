package com.practise;

public class SwaptheStringWithoutVar {
	//24. swap two string variables without using third or temp variable.

	public static void main(String args[]) {
	String a = "Selenium";
	String b = "JAVA";
	System.out.println("Before swap: " + a + " " + b);
	a = a + b;
	b = a.substring(0, a.length() - b.length());
	a = a.substring(b.length());
	System.out.println("After Swap: " + a + " " + b);
}
}