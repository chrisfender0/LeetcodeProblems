package medium;

public class TestUtil {

	static boolean nodeListAreEqual(ListNode output, ListNode resultOfOperation) {
		while(output != null) {
			if(output.val != resultOfOperation.val || resultOfOperation == null) {
				return false;
			}
			output = output.next;
			resultOfOperation = resultOfOperation.next;
		}
		return true;
	}
	
	static ListNode arrayToListNode(int[] arr) {
		ListNode output = new ListNode(arr[0]);
		ListNode head = output;
		for(int i=1; i<arr.length; i++) {
			output.next = new ListNode(arr[i]);
			output = output.next;
		}
		return head;
	}

}
