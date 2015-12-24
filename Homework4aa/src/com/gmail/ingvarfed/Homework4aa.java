package com.gmail.ingvarfed;

import java.util.Random;
import java.util.Scanner;

public class Homework4aa {

	public static void main(String[] args) {
		System.out.print("Enter dimension: ");
		Scanner sc = new Scanner(System.in);
		int mSize = sc.nextInt();
		sc.close();
		System.out.println();
		// int[][] matrix =
		// {{0,0,0,1,1,1},{0,0,0,1,1,1},{0,0,0,1,1,1},{0,0,0,1,1,1},{0,0,0,1,1,1},{0,0,0,1,1,1}};
		
		// Creation of the matrix
		int[][] matrix = new int[mSize][mSize];
		Random rnd = new Random();
		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[i].length; ++j) {
				matrix[i][j] = rnd.nextInt(10);
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// Rotation of the matrix using 270 dgr rotation matrix
		for (int i = 0; i < matrix.length / 2; ++i) {
			for (int j = i; j < (matrix.length - i - 1); ++j) {
				int x = i;
				int y = j;
				int xyTemp = 0;
				int tempOld = matrix[x][y];
				int tempNew = tempOld;
				do {
					tempNew = tempOld;
					tempOld = matrix[y][-x + (matrix.length - 1)];
					matrix[y][-x + (matrix.length - 1)] = tempNew;
					xyTemp = x;
					x = y;
					y = -xyTemp + (matrix.length - 1);
				} while ((x != i) || (y != j));
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
