package medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {

	@Test
	void test1() {
		ListNode l1 = new ListNode(2, 
				new ListNode(4, 
						new ListNode(3)));
		ListNode l2 = new ListNode(5,
				new ListNode(6, 
						new ListNode(4)));
		ListNode output = new ListNode(7, 
				new ListNode(0, 
						new ListNode(8)));
		assertTrue(TestUtil.nodeListAreEqual(output, AddTwoNumbers.addTwoNumbers(l1, l2)));
	}
	
	@Test
	void test2() {
		ListNode l1 = new ListNode(2, 
				new ListNode(4,
						new ListNode(9)));
		ListNode l2 = new ListNode(5,
				new ListNode(6,
						new ListNode(4,
								new ListNode(9))));
		ListNode output = new ListNode(7, 
				new ListNode(0,
						new ListNode(4,
								new ListNode(0,
										new ListNode(1)))));
		assertTrue(TestUtil.nodeListAreEqual(output, AddTwoNumbers.addTwoNumbers(l1, l2)));
	}
	
	@Test
	void test3() {
		int[] arr1 = {9};
		ListNode l1 = TestUtil.arrayToListNode(arr1);
		
		int[] arr2 = {1, 9, 9, 9, 9, 9, 9, 9, 9, 9};
		ListNode l2 = TestUtil.arrayToListNode(arr2);
		
		int[] output = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
		ListNode lOutput = TestUtil.arrayToListNode(output);
		assertTrue(TestUtil.nodeListAreEqual(lOutput, AddTwoNumbers.addTwoNumbers(l1, l2)));
	}
	
	@Test
	void test4() {
		int[] arr1 = {0,8,6,5,6,8,3,5,7};
		ListNode l1 = TestUtil.arrayToListNode(arr1);
		
		int[] arr2 = {6,7,8,0,8,5,8,9,7};
		ListNode l2 = TestUtil.arrayToListNode(arr2);
		
		int[] output = {6,5,5,6,4,4,2,5,5,1};
		ListNode lOutput = TestUtil.arrayToListNode(output);
		assertTrue(TestUtil.nodeListAreEqual(lOutput, AddTwoNumbers.addTwoNumbers(l1, l2)));
	}
	
	@Test
	void test5() {
		int[] arr1 = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		ListNode l1 = TestUtil.arrayToListNode(arr1);
		
		int[] arr2 = {5,6,4};
		ListNode l2 = TestUtil.arrayToListNode(arr2);
		
		int[] output = {6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		ListNode lOutput = TestUtil.arrayToListNode(output);
		assertTrue(TestUtil.nodeListAreEqual(lOutput, AddTwoNumbers.addTwoNumbers(l1, l2)));
	}


}
