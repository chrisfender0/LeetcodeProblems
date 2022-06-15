package remove_linked_list_elements;

import utility.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements {
	
	public static void main(String[]args) {
		int[] arr = {1, 2, 3, 4, 3, 6};
		int val = 3;
		ListNode head = buildListNodeFromArray(arr);
		printListNode(removeElements(head,val));
	}	

	public static ListNode removeElements(ListNode head, int val) {
		ListNode cloneHead = new ListNode(0);
		cloneHead.next = head;
		ListNode clone = cloneHead;
		
		while(clone.next != null) {
			if(clone.next.val == val) {
				clone.next = clone.next.next;
			} else {
				clone = clone.next;
			}
		}
		return cloneHead.next;
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
	
	public static void printListNode(ListNode head) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(head != null) {
			sb.append(head.val);
			if(head.next != null) {
				sb.append(", ");
			}
			head = head.next;
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

}
