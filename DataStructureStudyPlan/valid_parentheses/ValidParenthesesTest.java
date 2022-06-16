package valid_parentheses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

	@Test
	void test1() {
		String s = "()";
		assertTrue(ValidParentheses.isValid(s));
	}
	
	@Test
	void test2() {
		String s = "()[]{}";
		assertTrue(ValidParentheses.isValid(s));
	}
	
	@Test
	void test3() {
		String s = "(]";
		assertFalse(ValidParentheses.isValid(s));
	}

}
