package pascals_triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

	@Test
	void test1() {
		int numRows = 5;
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(1);
		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(1);
		row2.add(1);
		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(1);
		row3.add(2);
		row3.add(1);
		List<Integer> row4 = new ArrayList<Integer>();
		row4.add(1);
		row4.add(3);
		row4.add(3);
		row4.add(1);
		List<Integer> row5 = new ArrayList<Integer>();
		row5.add(1);
		row5.add(4);
		row5.add(6);
		row5.add(4);
		row5.add(1);
		expected.add(row1);
		expected.add(row2);
		expected.add(row3);
		expected.add(row4);
		expected.add(row5);
		assertEquals(expected, PascalsTriangle.generate(numRows));
	}

}
