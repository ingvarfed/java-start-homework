package com.gmail.ingvarfed;

import java.util.Scanner;

public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side AB of the triangle:");
		double sideAB = sc.nextDouble();
		System.out.println("Enter side BC of the triangle:");
		double sideBC = sc.nextDouble();
		System.out.println("Enter side AC of the triangle:");
		double sideAC = sc.nextDouble();
		sc.close();
		double trianglePerimeter = sideAB + sideBC + sideAC;
		double triangleArea = Math.sqrt(0.5*trianglePerimeter*(0.5*trianglePerimeter - sideAC)*(0.5*trianglePerimeter - sideAB)*(0.5*trianglePerimeter - sideBC));
		System.out.println("Triangle area is " + triangleArea + " square units.");
	}

}
