package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String text = sc.nextLine();
		System.out.println("Enter the integer number:");
		int intNum = sc.nextInt();
		System.out.println("Enter the number with decimal part:");
		double dblNum = sc.nextDouble();
		sc.close();

		System.out.println(concatenation(intNum, dblNum, text));
	}
	
	/**
	 * Returns the concatenation of the string with the sum of integer and real number
	 * @param intNum - integer number
	 * @param dblNum - real number
	 * @param text - string
	 * @return Concatenation of the string with the sum of two numbers
	 */
	static String concatenation(int intNum, double dblNum, String text) {
		return text + Double.toString(intNum + dblNum);
	}

}
