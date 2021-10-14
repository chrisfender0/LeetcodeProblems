package easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		testcases();
	}
	
	public static String longestCommonPrefix(String[] strs) {
		String longestPrefix = strs[0];
		for(int i=1; i<strs.length; i++) {
			while(strs[i].indexOf(longestPrefix) != 0) {
				longestPrefix = longestPrefix.substring(0, longestPrefix.length()-1);
			}
		}
        return longestPrefix;
    }
	
	public static void testcases() {
		String[] test1 = {"flowers", "flow", "flight"};
		String exp1 = "fl";
		System.out.println(formatme(test1, exp1));
		
		String[] test2 = {"dog", "racecar", "car"};
		String exp2 = "";
		System.out.println(formatme(test2,exp2));
		
		String[] test3 = {"aaa", "aa", "aaa"};
		String exp3 = "aa";
		System.out.println(formatme(test3, exp3));
		
		String[] test4 = {"c", "c"};
		String exp4 = "c";
		System.out.println(formatme(test4, exp4));
		
		String[] test5 = {"a", "a", "a"};
		String exp5 = "a";
		System.out.println(formatme(test5, exp5));
	}
	
	public static String formatme (String[] t, String e) {
		String temp = "{";
		for (String string : t) {
			temp = temp+"\""+string+"\""+"";
		}
		temp = temp+"}";
		StringBuilder sb = new StringBuilder();
		sb.append("Array:"+temp+"\n");
		sb.append("Expected: "+ e+"\n");
		sb.append("Actual: "+ longestCommonPrefix(t));
		return sb.toString();
	}

}
