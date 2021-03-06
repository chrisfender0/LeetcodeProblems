package valid_sudoku;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidSudokuTest {

	@Test
	void test1() {
		char[][] testData = 
		    {{'5','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		assertTrue(ValidSudoku.isValidSudoku(testData));
	}
	
	@Test
	void test2() {
		char[][] testData = 
		    {{'8','3','.','.','7','.','.','.','.'}
			,{'6','.','.','1','9','5','.','.','.'}
			,{'.','9','8','.','.','.','.','6','.'}
			,{'8','.','.','.','6','.','.','.','3'}
			,{'4','.','.','8','.','3','.','.','1'}
			,{'7','.','.','.','2','.','.','.','6'}
			,{'.','6','.','.','.','.','2','8','.'}
			,{'.','.','.','4','1','9','.','.','5'}
			,{'.','.','.','.','8','.','.','7','9'}};
		assertFalse(ValidSudoku.isValidSudoku(testData));
	}
	
	@Test
	void test3() {
		char[][] testData = 
		   {{'.','.','.','.','5','.','.','1','.'},
			{'.','4','.','3','.','.','.','.','.'},
			{'.','.','.','.','.','3','.','.','1'},
			{'8','.','.','.','.','.','.','2','.'},
			{'.','.','2','.','7','.','.','.','.'},
			{'.','1','5','.','.','.','.','.','.'},
			{'.','.','.','.','.','2','.','.','.'},
			{'.','2','.','9','.','.','.','.','.'},
			{'.','.','4','.','.','.','.','.','.'}};
		assertFalse(ValidSudoku.isValidSudoku(testData));
	}
	
	@Test
	void test4() {
		char[][] testData = 
		   {{'.','.','.','.','.','.','5','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'9','3','.','.','2','.','4','.','.'},
			{'.','.','7','.','.','.','3','.','.'},
			{'.','.','.','.','.','.','.','.','.'},
			{'.','.','.','3','4','.','.','.','.'},
			{'.','.','.','.','.','3','.','.','.'},
			{'.','.','.','.','.','5','2','.','.'}};
		assertFalse(ValidSudoku.isValidSudoku(testData));
	}
	
	@Test
	void test5() {
		char[][] testData = 
			{{'3','.','.','.','.','4','.','.','.'}
			,{'.','.','.','.','1','.','8','.','.'}
			,{'.','7','2','.','.','.','.','.','.'}
			,{'.','.','5','.','.','.','.','.','.'}
			,{'.','4','.','.','.','.','.','.','.'}
			,{'.','.','.','.','.','.','3','.','.'}
			,{'.','.','.','.','.','.','.','.','1'}
			,{'1','3','.','.','.','5','.','.','.'}
			,{'.','.','.','.','5','.','.','2','.'}};
		assertFalse(ValidSudoku.isValidSudoku(testData));
	}

}
