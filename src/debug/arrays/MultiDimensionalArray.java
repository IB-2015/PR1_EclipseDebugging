package debug.arrays;

import static pr.MakeItSimple.*;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int[][] matrix = buildMatrix(4, 3);
		
		matrix[2] = null;
		
		int[] newRow = {2, 4};
		matrix[3] = newRow;
		
		newRow[0] = 6;
		
		println("Finish");
	}

	private static int[][] buildMatrix(int m, int n) {
		int[][] matrix = new int[m][n];
		
		for(int row = 0; row < m; row++) {
			for(int column = 0; column < n; column++) {
				if (row == 0 || row == column) {
					matrix[row][column] = 1;
				} else {
					matrix[row][column] = 0;
				}
			}
		}
		
		return matrix;
	}

}
