package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework4cc {

	public static void main(String[] args) {
		System.out.print("Enter the money amount in numeral form: ");
		Scanner sc = new Scanner(System.in);
		double moneyNum = sc.nextDouble();
		sc.close();
		int dollars = (int) moneyNum;
		int cents = (int) ((moneyNum - dollars) * 100);

		String[] digits = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine" };
		String[] tens = { " ", " ten", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty",
				" ninety" };
		// String[] specialNumbers = { " ", "eleven", "twelve", "twenty",
		// "teen", "thir", "fif", "ty" };
		String[] special = { " million", " thousand", " hundred", "s", " dollar", " cent" };

		System.out.print("You have: ");
		if ((dollars / 100000000) != 0) {
			System.out.print(digits[(dollars / 100000000) % 10] + special[2]);
		}
		if ((dollars / 1000000) != 0) {
			System.out.print(tens[(dollars / 10000000) % 10] + digits[(dollars / 1000000) % 10] + special[0]);
		}
		if ((dollars / 100000) != 0) {
			System.out.print(digits[(dollars / 100000) % 10] + special[2]);
		}
		if ((dollars / 1000) != 0) {
			System.out.print(tens[(dollars / 10000) % 10] + digits[(dollars / 1000) % 10] + special[1]);
		}
		if ((dollars / 100) != 0) {
			System.out.print(digits[(dollars / 100) % 10] + special[2]);
		}
		if ((dollars / 1) != 0) {
			System.out.print(tens[(dollars / 10) % 10] + digits[(dollars / 1) % 10] + special[4] + special[3]);
		}
		if ((cents / 100) != 0) {
			System.out.print(digits[(cents / 100) % 10] + special[2]);
		}
		if ((cents / 1) != 0) {
			System.out.print(tens[(cents / 10) % 10] + digits[(cents / 1) % 10] + special[5] + special[3]);
		}
	}

}
