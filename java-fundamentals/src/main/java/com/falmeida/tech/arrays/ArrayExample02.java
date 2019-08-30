package com.falmeida.tech.arrays;

public class ArrayExample02 {

	public static void main(String[] args) {
		
		int N = 10;
		
		int[][] matrix = new int[N][N];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print("matrix["+i+"]["+j+"] = "+matrix[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
