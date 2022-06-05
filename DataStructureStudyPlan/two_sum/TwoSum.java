package two_sum;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
	
	public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
		int startPoint = 0;
		int endPoint;
		boolean notFound = true;
		while(notFound) {
			for(int i=(startPoint+1); i<nums.length; i++) {
				if(nums[startPoint] + nums[i] == target) {
					endPoint = i;
					output[0] = startPoint;
					output[1] = endPoint;
					notFound = false;
					break;
				}
			}
			startPoint +=1;
		}
		return output;
    }

}
