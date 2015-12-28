package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5cc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int arrSize = sc.nextInt();
		sc.close();

		Random rng = new Random();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rng.nextInt(10);
		}

		Arrays.sort(arr);
		do {
			System.out.println(Arrays.toString(arr));
		} while (permute(arr, arrSize));
	}

	/**
	 * Implementation of lexicographic permutation generation algorithm
	 * 
	 * @param arr
	 *            - array of elements
	 * @param arrSize
	 *            - array size
	 * @return Changes array to its permutation; returns true in case of success
	 *         and false otherwise
	 */
	static boolean permute(int[] arr, int arrSize) {
		int j = 0;
		int l = 0;
		int k = 0;
		int temp = 0;
		for (j = arrSize - 2; (j >= 0) && (arr[j] >= arr[j + 1]); j--) {
		}
		if (j == -1) {
			return false;
		}
		for (l = arrSize - 1; (arr[j] >= arr[l]) && (l >= j + 1); l--) {
		}
		temp = arr[j];
		arr[j] = arr[l];
		arr[l] = temp;
		for (k = j + 1; k <= (arrSize + j) / 2; k++) {
			l = arrSize + j - k;
			temp = arr[k];
			arr[k] = arr[l];
			arr[l] = temp;
		}
		return true;
	}
}
