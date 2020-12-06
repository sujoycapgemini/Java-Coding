package com.javacoding;

/*To calculate minimum cost to convert 
any 3x3 array into magic Square*/

public class MagicSquare {

	/*
	 * this program takes in two 2D arrays as input and compares them to find out
	 * the cost it needs to convert array to magic square.
	 */
	
	public static int findCostFromMagicSquare(int[][] arr, int[][] ms) {
		int cost = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] != ms[i][j])

					cost = cost + Math.abs(arr[i][j] - ms[i][j]);
					
			}
		}
		
		return cost;
	}

	// to find the minimum cost
	public static int findMinimumCost(int[][] arr) {
		int[][][] ms = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }, };

		/*
		 * since sum of all the elements from 1 to 9 is 45, so we cost should be less
		 * than 45
		 */

		int min = 45;
		for (int i = 0; i < 8; i++) {
			int x = findCostFromMagicSquare(arr, ms[i]);
			if (x < min)
				min = x;
		}
		return min;
	}

	
	  //to print the minimum cost
	
	public static void main(String[] args) {
		
		int[][] arr = { { 5, 3, 4 }, { 1, 5, 8 }, { 6, 4, 2 } };

		System.out.println("Minimum Cost is : " +findMinimumCost(arr));
	}
}
