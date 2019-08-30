package com.falmeida.tech.arrays;

public class ArrayExample03 {

	public static void main(String[] args) {
		
		int N = 2;
		
		int[][][] matrix = new int[N][N][N];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				for (int t = 0; t < matrix.length; t++) {
					System.out.println("matrix["+i+"]["+j+"]["+t+"] = "+matrix[i][j][t]+" ");
				}				
			}
		}
		
	}
	
}
