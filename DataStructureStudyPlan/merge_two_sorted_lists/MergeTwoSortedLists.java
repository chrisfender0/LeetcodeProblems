package merge_two_sorted_lists;

import utility.ListNode;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
	
	public static ListNode buildListNodeFromArray(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode prev = head;
		if(arr.length == 1) {
			return head;
		}
		for(int i=1; i<arr.length; i++) {
			prev.next = new ListNode(arr[i]);
			prev = prev.next;
		}
		return head;
	}
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {
			return l2;
		} else if(l2 == null) {
			return l1;
		}
		
		ListNode fakeHead = new ListNode(0);
		ListNode merged = fakeHead;
		while(l1 != null && l2 != null) {
			if(l1.val<=l2.val) {
				merged.next = l1;
				l1 = l1.next;
			} else {
				merged.next = l2;
				l2 = l2.next;
			}
			merged = merged.next;
		}
		if(l1!=null) {
			merged.next = l1;
		} else if(l2!=null){
			merged.next = l2;
		}
		
		return fakeHead.next;
    }
	

}
