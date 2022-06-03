package contains_duplicate;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
	
	static boolean containsDuplicate(int[] nums) {
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(map.size() > 0 && map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], true);
			}
		}
		return false;
	}
	

}
