package linked_list_cycle;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {

	public static boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) {
			return false;
		}
		ListNode pointer = head;
		ListNode checker = head;
		while(checker != null && checker.next != null) {
			pointer = pointer.next;
			checker = checker.next.next;
			if(pointer == checker) {
				return true;
			}
		}
		return false;
	}

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
	
	public static ListNode cycledLinkedList() {
		ListNode head = new ListNode(3);
		ListNode cyclePoint = new ListNode(2);
		head.next = cyclePoint;
		ListNode pointer = new ListNode(0);
		cyclePoint.next = pointer;
		pointer.next = new ListNode(-4);
		pointer = pointer.next;
		pointer.next = cyclePoint;
		return head;
	}
}
