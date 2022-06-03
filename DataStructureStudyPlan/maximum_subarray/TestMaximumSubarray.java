package maximum_subarray;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMaximumSubarray {
	
	int[] testData1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //6
	int[] testData2 = {1}; //1
	int[] testData3 = {5, 4, -1, 7, 8}; //23

	@Test
	void test1() {
		assertEquals(6, MaximumSubarry.maxSubArray(testData1));
	}
	
	@Test
	void test2() {
		assertEquals(1, MaximumSubarry.maxSubArray(testData2));
	}
	
	@Test
	void test3() {
		assertEquals(23, MaximumSubarry.maxSubArray(testData3));
	}

}
