package easy;

public class MaximumSubarray {

	public static void main(String[] args) {
		testcases();
	}

	public static int maxSubArray(int[] nums) {
		int result = nums[0];
		int temp = nums[0];
		for(int i=1; i<nums.length; i++) {
			temp = Math.max(temp+nums[i], nums[i]);
			result = Math.max(result,temp);
		}
		return result;
	}
	
	static void testcases() {
		tc1();
		tc2();
		tc3();
	}
	
	static void tc1() {
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int exp = 6;
		System.out.println(formatMe(nums, exp));
	}
	
	static void tc2() {
		int[] nums = {1};
		int exp = 1;
		System.out.println(formatMe(nums, exp));
	}
	
	static void tc3() {
		int[] nums = {5, 4, -1, 7, 8};
		int exp = 23;
		System.out.println(formatMe(nums, exp));
	}
	
	static String formatMe(int[] nums, int exp) {
		StringBuilder sb = new StringBuilder();
		sb.append("Given Array: [");
		for(int i=0; i<nums.length; i++) {
			if(i==nums.length-1) {
				sb.append(nums[i] + "]\n");
			} else {
				sb.append(nums[i] + ", ");
			}
			
		}
		sb.append("Expected output: " + exp + "\n");
		sb.append("Actual: " + maxSubArray(nums) + "\n");
		return sb.toString();
	}

}
