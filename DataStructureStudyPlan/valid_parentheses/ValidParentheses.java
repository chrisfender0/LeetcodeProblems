package valid_parentheses;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses
 */
public class ValidParentheses {
	
	public static boolean isValid(String s) {
        if(s.length()<2 || s.length()%2 == 1) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char c: s.toCharArray()) {
			switch(c) {
				case('('):
					stack.push(')');
					break;
				case('['):
					stack.push(']');
					break;
				case('{'):
					stack.push('}');
					break;
				default:
					if(stack.empty() || stack.pop() != c) {
						return false;
					}
					break;
			}
		}
		return stack.isEmpty();
	}

}
