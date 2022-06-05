package intersection_of_two_arrays_2;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArrays2 {
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> nums1List = new ArrayList<Integer>();
        List<Integer> nums2List = new ArrayList<Integer>();
        for(int i:nums1) {
        	nums1List.add(i);
        }
        for(int j:nums2) {
        	if(nums1List.contains(j)) {
        		nums2List.add(j);
        		nums1List.remove((Integer)j);
        	}
        }
        int[] output = new int[nums2List.size()];
        for(int n=0; n<nums2List.size(); n++) {
        	output[n] = nums2List.get(n);
        }
        return output;
    }

}
