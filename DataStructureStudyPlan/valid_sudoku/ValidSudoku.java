package valid_sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

	public static boolean isValidSudoku(char[][] board) {
		int rows = board.length;
		int columns = board[0].length;
		char empty = '.';
		List<Integer> box1 = new ArrayList<Integer>();
		List<Integer> box2 = new ArrayList<Integer>();
		List<Integer> box3 = new ArrayList<Integer>();
		
		for(int i=0; i<rows; i++) {
			List<Integer> row = new ArrayList<Integer>();
			List<Integer> column = new ArrayList<Integer>();
			
			// for 3x3 boxes stop at each i%3==0 and create a new box
			if(i%3==0) {
				printList(box1);
				printList(box2);
				printList(box3);
				if(!validateNoDuplicates(box1) ||
						!validateNoDuplicates(box2) ||
						!validateNoDuplicates(box3)) {
					return false;
				}
				box1 = new ArrayList<Integer>();
				box2 = new ArrayList<Integer>();
				box3 = new ArrayList<Integer>();
			}
			
			for(int j=0; j<columns; j++) {
				if(board[i][j] != empty) {
					row.add(Character.getNumericValue(board[i][j]));
					if(j<3) {
						box1.add(Character.getNumericValue(board[i][j]));
					}
					if(j>=3 && j<6) {
						box2.add(Character.getNumericValue(board[i][j]));
					}
					if(j >= 6) {
						box3.add(Character.getNumericValue(board[i][j]));
					}
				}
				if(board[j][i] != empty) {
					column.add(Character.getNumericValue(board[j][i]));
				}
			}
			printList(row);
			if(!validateNoDuplicates(row) || !validateNoDuplicates(column)) {
				return false;
			}
		}
		if(!validateNoDuplicates(box1) ||
				!validateNoDuplicates(box2) ||
				!validateNoDuplicates(box3)) {
			return false;
		}
		return true;
	}
	
	static boolean validateNoDuplicates(List<Integer> list) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i:list) {
			if(map.containsKey(i)) {
				return false;
			}
			map.put(i, true);
		}
		return true;
	}
	
	static void printList(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				sb.append(list.get(i));
			} else {
				sb.append(list.get(i) + ", ");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
