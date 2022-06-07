package reshape_the_matrix;

public class Utility {
	
	static void printMatrix(int[][] matrix) {
		int r = matrix.length;
		int c = matrix[0].length;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(j==0) {
					sb.append("{");
				}
				if(j==c-1) {
					sb.append(matrix[i][j]);
					sb.append("}");
				} else {
					sb.append(matrix[i][j]);
					sb.append(",");
				}
			}
			if(i==r-1) {
				sb.append("]");
			} else {
				sb.append(",");
			}
		}
		System.out.println(sb.toString());
	}
	
	static void print1DArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<arr.length; i++) {
			if(i!=arr.length-1) {
				sb.append(arr[i]+", ");
			} else {
				sb.append(arr[i]);
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
