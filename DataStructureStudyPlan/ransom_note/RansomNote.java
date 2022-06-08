package ransom_note;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {

	public static boolean canConstruct(String ransomNote, String magazine) {
		if(ransomNote.length() > magazine.length()) {
			return false;
		}
		List<Character> list = new ArrayList<>();
		for(int i=0; i<magazine.length(); i++) {
			list.add(magazine.charAt(i));
		}
		while(ransomNote.length() > 0) {
			Character c = ransomNote.charAt(0);
			if(list.contains(c)) {
				list.remove(c);
				ransomNote = ransomNote.substring(1, ransomNote.length());
			} else {
				return false;
			}
		}
		return true;
	}

}
