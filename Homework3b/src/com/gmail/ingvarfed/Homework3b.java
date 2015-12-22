package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3b {

	public static void main(String[] args) {
		int floors = 9;
		int flatsPerFloor = 4;
		int blocks = 4;
		int totalFlats = floors * flatsPerFloor * blocks;
		System.out.print("Enter the flat number, please: ");
		Scanner sc = new Scanner(System.in);
		int flat = sc.nextInt();
		sc.close();
		if ((flat < 1) || (flat > totalFlats)) {
			System.out.println("There is no such flat in this building.");
		} else {
			int flatBlock = flat / (floors * flatsPerFloor) + 1;
			int flatFloor = (flat % (floors * flatsPerFloor) - 1) / flatsPerFloor + 1;
			System.out.println("The flat is on the " + flatFloor + " floor in block " + flatBlock + ".");
		}
	}

}
