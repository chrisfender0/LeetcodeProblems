package implement_queue_using_stacks;

import java.util.Stack;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks
 */
public class MyQueue {

	Stack<Integer> stack;

	public MyQueue() {
		stack = new Stack<Integer>();
	}

	public void push(int x) {
		stack.push(x);
	}

	public int pop() {
		int i = stack.firstElement();
		stack.remove(0);
		return i;
	}

	public int peek() {
		return stack.firstElement();
	}

	public boolean empty() {
		return stack.isEmpty();
	}

}
