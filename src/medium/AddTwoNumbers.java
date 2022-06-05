package medium;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */

public class AddTwoNumbers {

	public static void main(String[] args) {
		BigInteger test = new BigInteger("123");
		System.out.println(test.divideAndRemainder((new BigInteger("10")))[1]);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		BigInteger l1Result = new BigInteger("0");
		BigInteger l2Result = new BigInteger("0");
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		BigInteger tempResult = new BigInteger("0");
		while(l1!=null) {
			sb1.append(Integer.toString(l1.val));
			l1 = l1.next;
		}
		while(l2!=null) {
			sb2.append(Integer.toString(l2.val));
			l2 = l2.next;
		}
		//add both results together
		l1Result = reverseStringBuilderToBigInteger(sb1);
		l2Result = reverseStringBuilderToBigInteger(sb2);
		tempResult = l1Result.add(l2Result);
		//turn it into a node
		ListNode output = new ListNode(tempResult.divideAndRemainder((new BigInteger("10")))[1].intValue());
		ListNode headNode = output; 
		tempResult = tempResult.divide(new BigInteger("10"));
		while(!tempResult.equals(new BigInteger("0"))) {
			output.next = new ListNode();
			output = output.next;
			output.val = (int) (tempResult.divideAndRemainder((new BigInteger("10")))[1].intValue());
			tempResult = tempResult.divide(new BigInteger("10"));
		}
		return headNode;
	}
	
	static BigInteger reverseStringBuilderToBigInteger(StringBuilder sb) {
		String[] temp = sb.toString().split("");
		BigInteger output = new BigInteger(temp[temp.length-1]);
		if(temp.length <= 1) {
			return output;
		}
		for(int i=temp.length-2; i>-1; i--) {
			output = output.multiply(new BigInteger("10")).add(new BigInteger(temp[i]));
		}
		return output;
	}
}
