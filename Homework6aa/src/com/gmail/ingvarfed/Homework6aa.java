package com.gmail.ingvarfed;

import java.util.Calendar;
import java.util.Scanner;

public class Homework6aa {

	public static void main(String[] args) {
		compareDate(dateInput(), Calendar.getInstance());
	}

	/**
	 * Creates Calendar object from user input
	 * @return Calendar object
	 */
	public static Calendar dateInput() {
		Calendar setDate = Calendar.getInstance();

		System.out.print("Enter the date (YYYY-MM-DD): ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();

		String[] strArr = str.split("[-]");
		setDate.set(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]) - 1, Integer.parseInt(strArr[2]));

		return setDate;
	}

	/**
	 * Compares two dates and outputs a message when the elements are different
	 * @param setDate - first date
	 * @param curDate - second date
	 */
	public static void compareDate(Calendar setDate, Calendar curDate) {
		if (setDate.get(Calendar.YEAR) != curDate.get(Calendar.YEAR)) {
			System.out.println("The year is different!");
		}
		if (setDate.get(Calendar.MONTH) != curDate.get(Calendar.MONTH)) {
			System.out.println("The month is different!");
		}
		if (setDate.get(Calendar.DATE) != curDate.get(Calendar.DATE)) {
			System.out.println("The date is different!");
		}
	}
}
