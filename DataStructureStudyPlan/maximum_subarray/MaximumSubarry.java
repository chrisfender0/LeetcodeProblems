package maximum_subarray;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarry {
	
	static int maxSubArray(int[] nums) {
		int result = nums[0];
		int temp = nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = Math.max(temp+nums[i], nums[i]);
			result = Math.max(result,temp);
		}
		return result;
	}

}
