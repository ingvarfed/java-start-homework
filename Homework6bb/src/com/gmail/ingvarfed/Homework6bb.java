package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework6bb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		sc.close();
		
		System.out.println("The Hamming distance between " + a + " and " + b + " is " + hammingLength(a, b));
	}

	/**
	 * Calculates Hamming distance between two numbers
	 * @param a - first number
	 * @param b - second number
	 * @return - Hamming distance
	 */
	public static int hammingLength(int a, int b){
		int hLength = 0;
		int diff = a^b;
		for (int i = 0; i < 32; i++) {
			hLength += ((diff&1) == 1)?1:0;
			diff = diff >> 1;
		}
		return hLength;
	}
}
