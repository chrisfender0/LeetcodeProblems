package merge_sorted_array;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
	
	public static void main(String[]args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int m = 6;
		int[] nums2 = {2, 5, 6};
		int n = 3;
		int[] output = {1, 2, 2, 3, 5, 6};
		merge(nums1, m, nums2, n);
		for (int i : nums1) {
			System.out.println(i);
		}
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int pointer1 = m - 1; 
		int pointer2 = n - 1; 
		int i = m + n - 1;
        while(pointer2 >= 0) {
            if(pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]){
                nums1[i--] = nums1[pointer1--];
            } 
            else{
                nums1[i--] = nums2[pointer2--];
            }
        }
    }

}
