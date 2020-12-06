package com.javacoding;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Junit test cases
public class MagicSquareTest {
	
	MagicSquare magicSquare = new MagicSquare();
	
	
	//test to find cost to convert arr into magic square
	@Test
	public void testCostFromMagicSquare() {

		int[][] arr = { { 5, 3, 4 }, { 1, 5, 8 }, { 6, 4, 2 } };
		int[][] ms = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		int result = magicSquare.findCostFromMagicSquare(arr, ms);
		assertEquals(17, result);

		
	}
	
	//test to find minimum cost
	@Test
	public void testMinimumCost() {
		
		int[][] arr = { { 5, 3, 4 }, { 1, 5, 8 }, { 6, 4, 2 } };
		int result = magicSquare.findMinimumCost(arr);
		assertEquals(7, result);
		
	}

}
