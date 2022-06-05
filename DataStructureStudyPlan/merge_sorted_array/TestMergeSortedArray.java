package merge_sorted_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMergeSortedArray {

	@Test
	void test1() {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 6;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		int[] output = {1, 2, 2, 3, 5, 6};
		MergeSortedArray.merge(nums1, m, nums2, n);
		assertArrayEquals(output, nums1);
	}

}
