package remove_duplicates_from_sorted_list;

import utility.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode pointer = head;
		while(pointer!= null && pointer.next != null) {
			if(pointer.val == pointer.next.val) {
				pointer.next = pointer.next.next;
			} else {
				pointer = pointer.next;
			}
		}
		return head;
	}

}
