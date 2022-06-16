package remove_duplicates_from_sorted_list;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utility.ListNode;

class RemoveDuplicatesFromSortedListTest {

	@Test
	void test1() {
		ListNode actual = ListNode.createList(1, 1, 2);
		ListNode expected = ListNode.createList(1, 2);
		assertEquals(expected, RemoveDuplicatesFromSortedList.deleteDuplicates(actual));
	}
	
	@Test
	void test2() {
		ListNode actual = ListNode.createList(1,1,2,3,3);
		ListNode expected = ListNode.createList(1, 2, 3);
		assertEquals(expected, RemoveDuplicatesFromSortedList.deleteDuplicates(actual));
	}

}
