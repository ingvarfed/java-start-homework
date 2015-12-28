package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of a rectangle: ");
		int length = sc.nextInt();
		System.out.print("Enter the width of a rectangle: ");
		int width = sc.nextInt();
		sc.close();
		
		System.out.println("Lets draw " + length + "X" + width + " rectangle!");
		drawRectangle(length, width);
	}
	
	/**
	 * Draws a rectangle filled with "*" symbol
	 * @param length - the length of a rectangle
	 * @param width - the width of a rectangle
	 */
	static void drawRectangle (int length, int width) {
		for(int i = 0; i < length; ++i){
			for (int j = 0; j < width; ++j){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
