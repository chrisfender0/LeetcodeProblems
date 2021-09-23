package easy;

public class TwoSum {

	public static void main(String[] args) {
		int[] test1 = {2, 7, 11, 15};
		int target1 = 9;
		//expected output [0,1]
		int[] output1 = twoSum(test1, target1);
		System.out.println("Output: ["+ output1[0]+","+output1[1]+"]");
		
		int[] test2 = {3,2,4};
		int target2 = 6;
		//expected output [1,2]
		int[] output2 = twoSum(test2, target2);
		System.out.println("Output: ["+ output2[0]+","+output2[1]+"]");
		
		int[] test3 = {3,3};
		int target3 = 6;
		//expected output [0,1]
		int[] output3 = twoSum(test3, target3);
		System.out.println("Output: ["+ output3[0]+","+output3[1]+"]");
	}
	
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
