package com.gmail.ingvarfed;

public class Homework5bb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxPali = 0;
		for (int i = 999; i >= 100; --i) {
			for (int j = 999; j >= 100; --j) {
				if ((maxPali < (i * j)) && paliCheck(i * j)) {
					maxPali = i * j;
				}
			}
		}
		System.out.println(maxPali + " is the biggest palindrome.");
	}

	/**
	 * Checks if the integer number is a palindrome
	 * 
	 * @param number
	 *            - the number that is checked
	 * @return true if palindrome; false if not
	 */
	static boolean paliCheck(int number) {
		int temp = number;
		int reverse = 0;
		while (temp != 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp /= 10;
		}
		if (number == reverse) {
			return true;
		} else {
			return false;
		}
	}
}
