package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework5e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String text = sc.nextLine();
		sc.close();

		int wordcount = countWords(text);
		System.out.println("The string has " + wordcount + " words.");
	}

	/**
	 * Counts number of words in a string
	 * @param text - the string
	 * @return Number of words in a string
	 */
	static int countWords(String text) {
		String[] textWords = text.split("\\s+|[.,]|[.,]+\\s");
		return textWords.length;
	}
}
