package easy;

public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int remove = 3;
		System.out.println(removeElement(nums, remove));
	}

	public static int removeElement(int[] nums, int val) {
		int head = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				nums[head++] = nums[i];
			}
		}
		return head;
	}

}
