package search_a_2d_matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SearchA2DMatrixTest {

	@Test
	void test1() {
		int[][] testData = 
			{{1,3,5,7}
			,{10,11,16,20}
			,{23,30,34,60}};
		int target = 3;
		assertTrue(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test2() {
		int[][] testData = 
			{{1,3,5,7}
			,{10,11,16,20}
			,{23,30,34,60}};
		int target = 13;
		assertFalse(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test3() {
		int[][] testData = {{1, 3}};
		int target = 3;
		assertTrue(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test4() {
		int[][] testData = {{1,1},{2,2}};
		int target = 2;
		assertTrue(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test5() {
		int[][] testData = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int target = 11;
		assertTrue(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test6() {
		int[][] testData = 
			{{-8,-8,-7,-7,-6,-5,-3,-2}
			,{0,0,1,3,4,6,8,8}
			,{11,12,14,16,18,18,19,19}
			,{22,23,25,27,28,30,30,31}
			,{34,35,37,39,40,42,43,45}
			,{48,50,51,51,53,54,55,57}
			,{58,60,62,62,62,63,63,65}
			,{68,69,71,72,72,72,74,76}};
		int target = 76;
		assertTrue(SearchA2DMatrix.searchMatrix(testData, target));
	}
	
	@Test
	void test7() {
		int[][] testData = 
			{{-9,-8,-8},{-5,-3,-2},{0,2,2},{4,6,8}};
		int target = 15;
		assertFalse(SearchA2DMatrix.searchMatrix(testData, target));
	}

}
