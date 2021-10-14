package easy;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] n = {1, 2, 2, 3, 3, 3};
		System.out.println(removeDuplicates(n));
	}
	
	public static int removeDuplicates(int[] nums) {
		int uniqueNums = 1;
		for(int i=1; i<nums.length; i++) {
			if(nums[i-1] != nums[i]) {
				nums[uniqueNums++] = nums[i];
			}
		}
		return uniqueNums;
    }

}
