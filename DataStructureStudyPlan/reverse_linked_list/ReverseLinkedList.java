package reverse_linked_list;

import java.util.ArrayList;

import utility.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode listNode = ListNode.createList(1, 2, 3, 4, 5);
		recursiveReverseList(listNode);
	}

	public static ListNode reverseList(ListNode head) {
		ListNode pointer = head;
		ArrayList<ListNode> list = new ArrayList<>();
		while (pointer != null) {
			list.add(pointer);
			pointer = pointer.next;
		}
		ListNode output = new ListNode(0);
		ListNode outputHead = output;
		for (int i = list.size() - 1; i > -1; i--) {
			output.next = new ListNode(list.get(i).val);
			output = output.next;
		}
		return outputHead.next;
	}

	public static ListNode recursiveReverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode newHead = recursiveReverseList(head.next);

		head.next.next = head;
		head.next = null;

		return newHead;
	}

	public static ListNode buildListNodeFromArray(int[] arr) {
		ListNode head = new ListNode(arr[0]);
		ListNode prev = head;
		if (arr.length == 1) {
			return head;
		}
		for (int i = 1; i < arr.length; i++) {
			prev.next = new ListNode(arr[i]);
			prev = prev.next;
		}
		return head;
	}

	public static void printListNode(ListNode head) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while (head != null) {
			sb.append(head.val);
			if (head.next != null) {
				sb.append(", ");
			}
			head = head.next;
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
}
