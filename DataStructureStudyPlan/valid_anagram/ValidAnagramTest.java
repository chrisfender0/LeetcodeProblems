package valid_anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidAnagramTest {

	@Test
	void test1() {
		String s = "anagram";
		String t = "nagaram";
		assertTrue(ValidAnagram.isAnagram(s, t));
	}
	
	@Test
	void test2() {
		String s = "rat";
		String t = "car";
		assertFalse(ValidAnagram.isAnagram(s, t));
	}

}
