package remove_linked_list_elements;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import linked_list_cycle.ListNode;

class RemoveLinkedListElementsTest {

	@Test
	void test1() {
		int[] arr1 = {1, 2, 6, 3, 4, 5, 6};
		int val = 6;
		ListNode actual = RemoveLinkedListElements.removeElements(buildListNodeFromArray(arr1), val);
		
		int[] arr2 = {1, 2, 3, 4, 5};
		ListNode expected = buildListNodeFromArray(arr2);
		
		assertEqualsListNode(expected, actual);
	}
	
	@Test
	void test2() {
		int[] arr1 = {};
		int val = 1;
		ListNode actual = RemoveLinkedListElements.removeElements(buildListNodeFromArray(arr1), val);

		int[] arr2 = {};
		ListNode expected = buildListNodeFromArray(arr2);
		
		assertEqualsListNode(expected, actual);
	}
	
	@Test
	void test3() {
		int[] arr1 = {7, 7, 7, 7};
		int val = 7;
		ListNode actual = RemoveLinkedListElements.removeElements(buildListNodeFromArray(arr1), val);

		int[] arr2 = {};
		ListNode expected = buildListNodeFromArray(arr2);
		
		assertEqualsListNode(expected, actual);
	}
	
	boolean assertEqualsListNode(ListNode expected, ListNode actual){
		while(expected != null) {
			if(actual == null) {
				return false;
			}
			if(expected.val != actual.val) {
				return false;
			}
			
			expected = expected.next;
			actual = actual.next;
		}
		return true;
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

}
