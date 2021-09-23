package easy;

public class ReverseInteger {

	public static void main(String[] args) {
		int test1 = 123;
		//expected output 321
		int output1 = reverse(test1);
		System.out.println(output1);
		
		int test2 = -123;
		//expected output -321
		int output2 = reverse(test2);
		System.out.println(output2);
		
		int test3 = 120;
		//expected output 21
		int output3 = reverse(test3);
		System.out.println(output3);
		
		int test4 = 1999999999;
		//expected output 0
		int output4 = reverse(test4);
		System.out.println(output4);
	}
	
	public static int reverse(int x) {
        if(x == 0) return 0;
        boolean negative = false;
        long num = x;
        if(num<0) {
        	negative = true;
        	num *= -1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        sb = sb.reverse();
        num = Long.parseLong(sb.toString());
        
        if((num-Integer.MAX_VALUE)>0) {
        	return 0;
        } else {
        	if(negative) {
        		num *= -1;
        	}
        	return (int) num;
        }
    }

}
