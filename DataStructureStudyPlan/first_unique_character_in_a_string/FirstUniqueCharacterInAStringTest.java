package first_unique_character_in_a_string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInAStringTest {

	@Test
	void test1() {
		String s = "leetcode";
		int expected = 0;
		assertEquals(expected, FirstUniqueCharacterInAString.firstUniqChar(s));
	}
	
	@Test
	void test2() {
		String s = "loveleetcode";
		int expected = 2;
		assertEquals(expected, FirstUniqueCharacterInAString.firstUniqChar(s));
	}
	
	@Test
	void test3() {
		String s = "aabb";
		int expected = -1;
		assertEquals(expected, FirstUniqueCharacterInAString.firstUniqChar(s));
	}
}
