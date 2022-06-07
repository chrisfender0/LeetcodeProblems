package reshape_the_matrix;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReshapeTheMatrixTest {

	@Test
	void test1() {
		int[][] mat = {{1, 2}, {3, 4}};
		int[][] expected = {{1, 2, 3, 4}};
		int r = 1;
		int c = 4;
		assertArrayEquals(expected, ReshapeTheMatrix.matrixReshape(mat, r, c));
	}
	
	@Test
	void test2() {
		int[][] mat = {{1, 2}, {3, 4}};
		int[][] expected = {{1, 2}, {3, 4}};
		int r = 2;
		int c = 4;
		assertArrayEquals(expected, ReshapeTheMatrix.matrixReshape(mat, r, c));
	}
	
	@Test
	void test3() {
		int[][] mat = {{1, 2}, {3, 4}, {5, 6}};
		int[][] expected = {{1, 2, 3}, {4, 5, 6}};
		int r = 2;
		int c = 3;
		assertArrayEquals(expected, ReshapeTheMatrix.matrixReshape(mat, r, c));
	}

}
