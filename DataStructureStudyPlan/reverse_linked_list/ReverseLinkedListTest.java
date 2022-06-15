package reverse_linked_list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import utility.ListNode;

class ReverseLinkedListTest {

	@Test
	void test1() {
		ListNode actual = ListNode.createList(1, 2, 3, 4, 5);
		ListNode expected = ListNode.createList(5, 4, 3, 2, 1);
		
		assertEquals(expected, ReverseLinkedList.reverseList(actual));
	}
	
	@Test
	void test2() {
		ListNode actual = ListNode.createList(1, 2);
		ListNode expected = ListNode.createList(2, 1);
		
		assertEquals(expected, ReverseLinkedList.reverseList(actual));
	}

}
