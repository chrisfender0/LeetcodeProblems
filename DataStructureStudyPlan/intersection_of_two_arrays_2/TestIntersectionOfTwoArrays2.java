package intersection_of_two_arrays_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIntersectionOfTwoArrays2 {

	@Test
	void test1() {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] output = {2, 2};
		assertArrayEquals(output, IntersectionOfTwoArrays2.intersect(nums1, nums2));
	}
	
	@Test
	void test2() {
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {9, 4, 9, 8, 4};
		int[] output = {9, 4};
		assertArrayEquals(output, IntersectionOfTwoArrays2.intersect(nums1, nums2));
	}
	
}
