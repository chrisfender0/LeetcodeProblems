package easy;

public class RomanToInt {

	public static void main(String[] args) {
		String test7 = "MDLXX";
		//expected output 1570
		System.out.println("Roman numeral " + test7 + "=" + romanToInt(test7));
	}
	
	public static int romanToInt(String s) {
		int result = 0;
		int pointer = 1;
		for(int i=0; i<s.length(); i++) {
			if(pointer<s.length()) {
				if(s.charAt(pointer) == s.charAt(i)){
					//don't go out of bounds and check for 3 in a row
					result += singleRomanToInt(s.charAt(pointer));
					result += singleRomanToInt(s.charAt(i));
					if(pointer+1 < s.length() && s.charAt(pointer+1) == s.charAt(i)) {
						result += singleRomanToInt(s.charAt(pointer+1));
						pointer++; i++;
					} 
					pointer++; i++;
				} else if(isSubtract(s.charAt(i), s.charAt(pointer))) {
					result += (singleRomanToInt(s.charAt(pointer)) - singleRomanToInt(s.charAt(i)));
					pointer++; i++;
				} else {
					result += singleRomanToInt(s.charAt(i));
				}
			} else {
				result += singleRomanToInt(s.charAt(i));
			}
			
			pointer++;
		}
		
		return result;
	}
	
	public static int singleRomanToInt(char s) {
		/*
		 * HashMap<String, Integer> map = new HashMap<String, Integer>(){{ put("I", 1);
		 * put("V", 5); put("X", 10); put("L", 50); put("C", 100); put("D", 500);
		 * put("M", 1000); }}; if(map.containsKey(s)) { return map.get(s); }
		 */
		switch(s) {
		case('I'): return 1;
		case('V'): return 5;
		case('X'): return 10;
		case('L'): return 50;
		case('C'): return 100;
		case('D'): return 500;
		case('M'): return 1000;
		default: break;
		}
		return 0;
	}
	
	public static boolean isSubtract(char a, char b) {
		//only I, X and C can be placed before to make a subtract
		switch(a) {
		case('I'): 
			if(b == 'V' || b == 'X') {
				return true;
			}
		break;
		case('X'):
			if(b == 'L' || b == 'C') {
				return true;
			}
		break;
		case('C'):
			if(b == 'D' || b == 'M') {
				return true;
			}
		break;
		default: return false;
		}
		return false;
	}
	
	
	public static void testcases() {
		String test1 = "III";
		//expected output 3
		System.out.println("Roman numeral " + test1 + "=" + romanToInt(test1));
		
		String test2 = "IV";
		//expected output 4
		System.out.println("Roman numeral " + test2 + "=" + romanToInt(test2));
		
		String test3 = "IX";
		//expected output 9
		System.out.println("Roman numeral " + test3 + "=" + romanToInt(test3));
		
		String test4 = "LVIII";
		//expected output 58
		System.out.println("Roman numeral " + test4 + "=" + romanToInt(test4));
		
		String test5 = "MCMXCIV";
		//expected output 1994
		System.out.println("Roman numeral " + test5 + "=" + romanToInt(test5));
		
		String test6 = "DCXXI";
		//expected output 621
		System.out.println("Roman numeral " + test6 + "=" + romanToInt(test6));
		
		String test7 = "MDLXX";
		//expected output 1570
		System.out.println("Roman numeral " + test7 + "=" + romanToInt(test7));
	}
	

}
