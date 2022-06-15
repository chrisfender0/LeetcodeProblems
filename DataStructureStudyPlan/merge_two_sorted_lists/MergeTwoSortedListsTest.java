package merge_two_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import linked_list_cycle.ListNode;

class MergeTwoSortedListsTest {

	@Test
	void test() {
		int[] arr1 = {1, 2, 4};
		ListNode list1 = MergeTwoSortedLists.buildListNodeFromArray(arr1);
		
		int[] arr2 = {1, 3, 4};
		ListNode list2 = MergeTwoSortedLists.buildListNodeFromArray(arr2);
		
		int[] arr3 = {1, 1, 2, 3, 4, 4};
		ListNode expected = MergeTwoSortedLists.buildListNodeFromArray(arr3);
		
		assertEqualsListNode(expected, MergeTwoSortedLists.mergeTwoLists(list1, list2));
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

}
