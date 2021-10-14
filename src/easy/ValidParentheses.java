package easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		testcases();
	}
	
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
	
	public static boolean isOpener(String s) {
		switch(s) {
			case("("): 
				return true;
			case("{"):
				return true;
			case("["):
				return true;
			default:
				return false;
		}
	}
	
	public static String closer(String s) {
		switch(s) {
			case("("): 
				return ")";
			case("{"):
				return "}";
			case("["):
				return "]";
			default:
				return null;
		}
	}
	
	public static void testcases() {
		String test1 = "()";
		boolean exp1 = true;
		System.out.println(formatme(test1, exp1));
		
		String test2 = "()[]{}";
		boolean exp2 = true;
		System.out.println(formatme(test2, exp2));
		
		String test3 = "(]";
		boolean exp3 = false;
		System.out.println(formatme(test3, exp3));
		
		String test4 = "([)]";
		boolean exp4 = false;
		System.out.println(formatme(test4, exp4));
		
		String test5 = "{[]}";
		boolean exp5 = true;
		System.out.println(formatme(test5, exp5));
		
		String test6 = "[";
		boolean exp6 = false;
		System.out.println(formatme(test6, exp6));
		
		String test7 = "((";
		boolean exp7 = false;
		System.out.println(formatme(test7, exp7));
		
		String test8 = "){";
		boolean exp8 = false;
		System.out.println(formatme(test8, exp8));
	}
	
	public static String formatme (String test, boolean exp) {
		StringBuilder sb = new StringBuilder();
		sb.append("Test: \""+test+"\"\n");
		sb.append("Expected: "+ exp+"\n");
		sb.append("Actual: "+ isValid(test) + "\n");
		return sb.toString();
	}

}
