package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 *   1   
 *   11
 *   121
 *   1331
 *   14641 
 *   next row item is calculated with 
 *   row(i) = previousRow(i-1) + previousRow(i)
 */
public class PascalsTriangle {

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		int currentRow = 1;
		while(currentRow <= numRows) {
			List<Integer> row = new ArrayList<Integer>();
			for(int i=0; i<currentRow; i++) {
				if(i==0 || i==currentRow-1) {
					row.add(1);
				} else {
					int leftNum = output.get(currentRow-2).get(i-1);
					int rightNum = output.get(currentRow-2).get(i);
					row.add(leftNum + rightNum);
				}
			}
			output.add(row);
			currentRow++;
		}
		return output;
	}

}
