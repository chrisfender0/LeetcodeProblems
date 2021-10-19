package easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		testcases();
	}

	public static int lengthOfLastWord(String s) {
		String[] temp = s.split(" ");
		return temp[temp.length-1].length();
	}
	
	static void testcases() {
		tc1();
		tc2();
	}
	
	static void tc1() {
		String s = "   fly me   to   the moon  ";
		int exp = 4;
		System.out.println(formatMe(s, exp));
	}
	
	static void tc2() {
		String s =  "Hello World";
		int exp = 5;
		System.out.println(formatMe(s, exp));
	}
	
	static String formatMe(String s, int exp) {
		StringBuilder sb = new StringBuilder();
		sb.append("Given String: \n" + s + "\n");
		sb.append("Expected: " + exp + "\n");
		sb.append("Actual: " + lengthOfLastWord(s) +  "\n");
		return sb.toString();
	}

}
