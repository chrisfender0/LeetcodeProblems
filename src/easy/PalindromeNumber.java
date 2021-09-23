package easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		int test1 = 121;
		//expected output true
		System.out.println("is " + test1 + " is a Palindromic number?\nAnswer: " + isPalindrome(test1));
		
		int test2 = -121;
		//expected output true
		System.out.println("is " + test2 + " is a Palindromic number?\nAnswer: " + isPalindrome(test2));
		
		int test3 = 10;
		//expected output true
		System.out.println("is " + test3 + " is a Palindromic number?\nAnswer: " + isPalindrome(test3));
		
		int test4 = -101;
		//expected output true
		System.out.println("is " + test4 + " is a Palindromic number?\nAnswer: " + isPalindrome(test4));
	}
	
	
	
	static boolean isPalindrome(int x) {
		if(x<0) return false; //negative numbers
		String str = String.valueOf(x);
		int i=0; int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
