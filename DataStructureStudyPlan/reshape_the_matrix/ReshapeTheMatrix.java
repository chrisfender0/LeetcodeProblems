package reshape_the_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/reshape-the-matrix/
 */
public class ReshapeTheMatrix {
	
	public static void main(String[]args) {
		int[][] testData = {{1,2},{3,4}};
		int r = 1;
		int c = 4;
		System.out.println(testData[0].length);
		Utility.printMatrix(testData);
		Utility.print1DArray(to1DArray(testData));
		
	}

	public static int[][] matrixReshape(int[][] mat, int r, int c) {
		int[] oneDimensionArray = to1DArray(mat);
		int[][] output = new int[r][c];
		if(r==1) {
			return to2DArray(oneDimensionArray);
		}
		if(r*c != oneDimensionArray.length) {
			return mat;
		}
		int index = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				output[i][j] = oneDimensionArray[index];
				index++;
			}
		}
		return output;
	}
	
	static int[] to1DArray(int[][] mat) {
		int r = mat.length;
		int c = mat[0].length;
		List<Integer> temp = new ArrayList<>();
		// for each row = i
		for(int i=0; i<r; i++) {
			// for each column = j
			for(int j=0; j<c; j++) {
				temp.add(mat[i][j]);
			}
		}
		int[] output = new int[temp.size()];
		for(int i=0; i<temp.size(); i++) {
			output[i] = temp.get(i);
		}
		return output;
	}
	
	// Special use case when r==1 
	static int[][] to2DArray(int[] arr) {
		int[][] output = new int[1][arr.length];
		for(int i=0; i<arr.length; i++) {
			output[0][i] = arr[i];
		}
		return output;
	}

}
