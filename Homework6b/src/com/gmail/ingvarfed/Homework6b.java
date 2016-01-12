package com.gmail.ingvarfed;

import java.util.Random;
import java.util.Scanner;

public class Homework6b {

	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		sc.close();
		int[] array = randArray(arrSize, 100);
		System.out.println(arrToString(array));
	}
	
	/**
	 * Creates an array filled with random numbers from 0 to RNG boundary
	 * @param arrSize - Size of the array
	 * @param rngBoundary - boundary of random numbers generator
	 * @return array filled via RNG
	 */
	public static int[] randArray(int arrSize, int rngBoundary) {
		int[] array = new int[arrSize];
		Random rng = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(rngBoundary);
		}
		return array;
	}

	/**
	 * Arrays.toString alternative for the int[]
	 * @param array - the array to be converted
	 * @return converted array
	 */
	public static String arrToString(int[] array) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < array.length; i++) {
			sb.append(String.valueOf(array[i]));
			if (i != array.length - 1) {
				sb.append(", ");
			} else {
				sb.append("]");
			}
		}
		return sb.toString();
	}
}
