package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3aa {

	public static void main(String[] args) {
		double radius = 4.0;
		System.out.print("Enter X coordinate: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("Enter Y coordinate: ");
		double y = sc.nextDouble();
		sc.close();
		if ((x * x + y * y) <= radius * radius) {
			System.out.println("The point (" + x + "," + y + ") is in the circle with radius " + radius + ".");
		} else {
			System.out.println("The point (" + x + "," + y + ") is out of the circle with radius " + radius + ".");
		}
	}

}
