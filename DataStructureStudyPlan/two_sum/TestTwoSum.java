package two_sum;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTwoSum {
	
	int[] testData1 = {2, 7, 11, 15}; //9
	int testTarget1 = 9;
	int[] outputExpected1 = {0, 1};
	
	int[] testData2 = {3, 2, 4}; //6
	int testTarget2 = 6;
	int[] outputExpected2 = {1, 2};
	
	int[] testData3 = {3, 3};
	int testTarget3 = 6;
	int[] outputExpected3 = {0, 1};
	

	@Test
	void test1() {
		assertArrayEquals(outputExpected1, TwoSum.twoSum(testData1, testTarget1));
	}
	
	@Test
	void test2() {
		assertArrayEquals(outputExpected2, TwoSum.twoSum(testData2, testTarget2));
	}
	
	@Test
	void test3() {
		assertArrayEquals(outputExpected3, TwoSum.twoSum(testData3, testTarget3));
	}

}
