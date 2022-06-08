package first_unique_character_in_a_string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString {
	public static int firstUniqChar(String s) {
		String[] arr = s.split("");
		List<Integer> output = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				output.remove(map.get(arr[i]));
			} else {
				map.put(arr[i], i);
				output.add(i);
			}
		}
		if(output.size()==0) {
			return -1;
		}
		return output.get(0);
	}
}
