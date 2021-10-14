package easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		tc1();
	}

	public static int searchInsert(int[] nums, int target) {
		int lowerBound = 0, higherBound = nums.length-1, mid;
		while(lowerBound<=higherBound) {
			mid = lowerBound + (higherBound-lowerBound)/2;
			if(target==nums[mid]) return mid;
			if(target < nums[mid]) {
				higherBound = mid-1;
			} else {
				lowerBound = mid+1;
			}
		}
		return lowerBound;
	}
	
	public static void testcases(){
		tc1();
		tc2();
	}
	
	public static void tc1() {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int exp = 2;
		int searchInsert = searchInsert(nums, target);
		System.out.println(formatMe(searchInsert, exp));
	}
	
	public static void tc2() {
		int[] nums = {1, 3, 5, 6};
		int target = 2;
		int exp = 1;
		int searchInsert = searchInsert(nums, target);
		System.out.println(formatMe(searchInsert, exp));
	}
	
	public static String formatMe(int searchInsert, int exp) {
		StringBuilder sb = new StringBuilder();
		sb.append("Expected: " + exp + "\n");
		sb.append("Actual: " + searchInsert + "\n");
		return sb.toString();
	}

}
