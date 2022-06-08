package ransom_note;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RansomNoteTest {

	@Test
	void test1() {
		String ransomNote = "a";
		String magazine = "b";
		assertFalse(RansomNote.canConstruct(ransomNote, magazine));
	}
	
	@Test
	void test2() {
		String ransomNote = "aa";
		String magazine = "ab";
		assertFalse(RansomNote.canConstruct(ransomNote, magazine));
	}
	
	@Test
	void test3() {
		String ransomNote = "aa";
		String magazine = "aab";
		assertTrue(RansomNote.canConstruct(ransomNote, magazine));
	}

}
