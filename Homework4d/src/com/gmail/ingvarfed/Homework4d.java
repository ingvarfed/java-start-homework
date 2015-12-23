package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework4d {

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		int bCounter = 0;
		for (int i = text.indexOf("b"); (i >= 0) && (i < text.length()); i = text.indexOf("b")) {
			text = text.substring((i + 1), text.length());
			++bCounter;
		}
		System.out.println("The entered string has " + bCounter + " b.");
	}

}
