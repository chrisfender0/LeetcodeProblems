package easy;

import java.util.ArrayList;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		int[] ls = {4,2,1};
		ListNode test = new ListNode(ls[0]);
		for (int i=1; i<ls.length; i++) {
			test = new ListNode(ls[i], test);
		}
		
		ListNode l1 = new ListNode(4);
		ListNode l2 = new ListNode(3, l1);
		ListNode l3 = new ListNode(1, l2);
		
		System.out.println(formatme(test, l3, null));
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1 == null) {
			return l2;
		} else if(l2 == null) {
			return l1;
		}
		
		ListNode fakeHead = new ListNode(0);
		ListNode merged = fakeHead;
		while(l1 != null && l2 != null) {
			if(l1.val<=l2.val) {
				merged.next = l1;
				l1 = l1.next;
			} else {
				merged.next = l2;
				l2 = l2.next;
			}
			merged = merged.next;
		}
		if(l1!=null) {
			merged.next = l1;
		} else if(l2!=null){
			merged.next = l2;
		}
		
		return fakeHead.next;
	}
	
	public static void testcases() {
		tc1();
	}
	
	public static void tc1() {
		int[] arr = {4,2,1};
		int[] arr2 = {4,3,1};
		ListNode l1 = new ListNode(arr[0]);
		ListNode l2 = new ListNode(arr2[0]);
		for (int i=1; i<arr.length; i++) {
			l1 = new ListNode(arr[i], l1);
		}
		for (int i=1; i<arr2.length; i++) {
			l2 = new ListNode(arr2[i], l2);
		}
		String exp = "[1,1,2,3,4,4]";
		System.out.println(formatme(l1, l2, exp));
	}
	
	public static String toString(ListNode l) {
		String s = "[";
		while(l != null) {
			if(l.next != null) {
				s = s + l.val + ", ";
			} else {
				s = s + l.val;
			}
			l = l.next;
		}
		s = s + "]";
		return s;
	}
	
	public static String formatme (ListNode l1, ListNode l2, String exp) {
		StringBuilder sb = new StringBuilder();
		sb.append("LS1: \""+toString(l1)+"\"\n");
		sb.append("LS2: \""+toString(l2)+"\"\n");
		sb.append("Expected: "+ exp+"\n");
		sb.append("Actual: "+ toString(mergeTwoLists(l1, l2)) + "\n");
		return sb.toString();
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}