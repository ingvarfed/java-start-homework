package com.gmail.ingvarfed;

import java.util.Formatter;

public class Homework6d {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			printNumber(Math.PI, i+2);
		}
	}

	/**
	 * Outputs number with set precision
	 * @param number - the number to output
	 * @param p - precision
	 */
	static void printNumber(double number, int p){
		Formatter fr = new Formatter();
		fr.format("%." + p + "f", number);
		System.out.println(fr.toString());
		fr.close();
	}
}
