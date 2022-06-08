package valid_anagram;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {

	public static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		List<Character> list = new ArrayList<>();
		for(int i=0; i<t.length(); i++) {
			list.add(t.charAt(i));
		}
		while(s.length() > 0) {
			Character c = s.charAt(0);
			if(list.contains(c)) {
				list.remove(c);
				s = s.substring(1, s.length());
			} else {
				return false;
			}
		}
		return true;
	}

}
