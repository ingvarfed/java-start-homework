package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework6c {

	public static void main(String[] args) {
		System.out.print("Enter binary number: ");
		Scanner sc = new Scanner(System.in);
		String bin = sc.nextLine();
		sc.close();
		System.out.println(binaryToDecimal(bin));
	}

	/**
	 * Converts binary number written in string to decimal integer
	 * 
	 * @param bin
	 *            - binary number written to string
	 * @return decimal integer
	 */
	static int binaryToDecimal(String bin) {
		return Integer.parseInt(bin, 2);
	}
}
