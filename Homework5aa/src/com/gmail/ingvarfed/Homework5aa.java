package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5aa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers separated by commas:");
		String values = sc.nextLine();
		sc.close();

		String[] valuesArr = values.split("[,]");
		double[] doubleArr = new double[valuesArr.length];
		for (int i = 0; i < valuesArr.length; ++i) {
			doubleArr[i] = Double.valueOf(valuesArr[i]);
		}

		checkArithmetic(doubleArr);
		checkGeometric(doubleArr);
		checkPowers(doubleArr);
	}

	/**
	 * Checks if the arrays is arithmetic progression; prints next number in
	 * case of confirmation
	 * 
	 * @param doubleArr
	 *            - array
	 */
	static void checkArithmetic(double[] doubleArr) {
		double step = doubleArr[1] - doubleArr[0];
		for (int i = 0; i < doubleArr.length - 1; i++) {
			if ((doubleArr[i + 1] - doubleArr[i]) != step) {
				return;
			}
		}
		System.out.println("We have arithmetic progression!");
		System.out.println("Next number is " + (doubleArr[doubleArr.length - 1] + step));
	}

	/**
	 * Checks if the arrays is geometric progression; prints next number in case
	 * of confirmation
	 * 
	 * @param doubleArr
	 *            - array
	 */
	static void checkGeometric(double[] doubleArr) {
		if (doubleArr[0] == 0) {
			return;
		}
		double step = doubleArr[1] / doubleArr[0];
		for (int i = 0; i < doubleArr.length - 1; i++) {
			if ((doubleArr[i + 1] / doubleArr[i]) != step) {
				return;
			}
		}
		System.out.println("We have geometric progression!");
		System.out.println("Next number is " + (doubleArr[doubleArr.length - 1] * step));
	}

	/**
	 * Checks if array is a collection of numbers in power 2 or 3; in case of
	 * confirmation prints the next number
	 * 
	 * @param doubleArr
	 *            - array
	 */
	static void checkPowers(double[] doubleArr) {
		int power = 0;

		double[] init = { Math.sqrt(doubleArr[0]), Math.cbrt(doubleArr[0]) };
		for (int i = 0; i < doubleArr.length; i++) {
			if (Math.sqrt(doubleArr[i]) != (init[0] + i)) {
				break;
			}
			if (i == (doubleArr.length - 1)) {
				power = 2;
			}
		}
		for (int i = 0; i < doubleArr.length; i++) {
			if (Math.cbrt(doubleArr[i]) != (init[1] + i)) {
				break;
			}
			if (i == (doubleArr.length - 1)) {
				power = 3;
			}
		}
		if (power != 0) {
			System.out.println("Power: " + power + "!");
			System.out.println("Next number is " + Math.pow(doubleArr.length + init[power - 2], power));
		}
	}

}
