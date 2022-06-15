package linked_list_cycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListCycleTest {

	@Test
	void test1() {
		ListNode head = LinkedListCycle.cycledLinkedList();
		assertTrue(LinkedListCycle.hasCycle(head));
	}
	
	@Test
	void test2() {
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(2);
		head.next = tail;
		tail.next = head;
		assertTrue(LinkedListCycle.hasCycle(head));
	}
	
	@Test
	void test3() {
		ListNode head = new ListNode(1);
		assertFalse(LinkedListCycle.hasCycle(head));
	}

}
