package search_a_2d_matrix;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 */
public class SearchA2DMatrix {

	public static void main(String[] args) {
		System.out.println(3 / 2);
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0, j = matrix[0].length-1;
        while(i < matrix.length && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            if(matrix[i][j] > target)  j--;
            else i++;
        }
        return false;
    }

	// Divide and conquer
	public static boolean BAD_SOLUTION_searchMatrix(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int midRowPointer = rows / 2;
		if(rows==1){
			for(int i=0; i<cols; i++) {
				if(target == matrix[0][i]) {
					return true;
				}
			}
			return false;
		}
		for (int i = 0; i < rows; i++) {
			if (target > matrix[midRowPointer][cols-1]) {
				i = midRowPointer;
				midRowPointer = midRowPointer == 1 ? 
						midRowPointer + 1 : 
						midRowPointer + ((cols-midRowPointer) / 2) + 1;
			} else {
				for (int j = 0; j < cols; j++) {
					if (target == matrix[i][j]) {
						return true;
					}
				}
			}
		}
		return false;
	}

}
