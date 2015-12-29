package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers separated by commas:");
		String values = sc.nextLine();
		sc.close();

		String[] valuesArr = values.split("[,]");
		int[] intArr = new int[valuesArr.length];
		for (int i = 0; i < valuesArr.length; ++i) {
			intArr[i] = Integer.valueOf(valuesArr[i]);
		}
		System.out.println(Arrays.toString(intArr));

		checkArithmetic(intArr);
		checkGeometric(intArr);
		checkPowers(intArr);
	}

	/**
	 * Checks if the arrays is arithmetic progression; prints next number in
	 * case of confirmation
	 * 
	 * @param intArr
	 *            - array
	 */
	static void checkArithmetic(int[] intArr) {
		int step = intArr[1] - intArr[0];
		for (int i = 0; i < intArr.length - 1; i++) {
			if ((intArr[i + 1] - intArr[i]) != step) {
				return;
			}
		}
		System.out.println("We have arithmetic progression!");
		System.out.println("Next number is " + (intArr[intArr.length - 1] + step));
	}

	/**
	 * Checks if the arrays is geometric progression; prints next number in case
	 * of confirmation
	 * 
	 * @param intArr
	 *            - array
	 */
	static void checkGeometric(int[] intArr) {
		if (intArr[0] == 0) {
			return;
		}
		int step = intArr[1] / intArr[0];
		for (int i = 0; i < intArr.length - 1; i++) {
			if (((intArr[i + 1] % intArr[i]) != 0) || ((intArr[i + 1] / intArr[i]) != step)) {
				return;
			}
		}
		System.out.println("We have geometric progression!");
		System.out.println("Next number is " + (intArr[intArr.length - 1] * step));
	}

	/**
	 * Checks if array is a collection of numbers in power 2 or 3; in case of
	 * confirmation prints the next number
	 * 
	 * @param intArr
	 *            - array
	 */
	static void checkPowers(int[] intArr) {
		if (intArr[0] == 0) {
			return;
		}

		int power = 0;

		for (int i = 0; i < intArr.length; i++) {
			if (Math.sqrt(intArr[i]) != (i + 1)) {
				break;
			}
			if (i == (intArr.length - 1)) {
				power = 2;
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			if (Math.cbrt(intArr[i]) != (i + 1)) {
				break;
			}
			if (i == (intArr.length - 1)) {
				power = 3;
			}
		}
		if (power != 0) {
			System.out.println("Power: " + power + "!");
			System.out.println("Next number is " + Math.pow(intArr.length + 1, power));
		}
	}

}
