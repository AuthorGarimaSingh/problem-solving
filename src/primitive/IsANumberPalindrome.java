package primitive;

public class IsANumberPalindrome {

	
	public static void main(String[] args) {
		IsANumberPalindrome obj=new IsANumberPalindrome();
		
		int n = 121321;
		System.out.println("Is " + n + " palindrome? " + obj.isPalindrome(n));
	}

	private boolean isPalindrome(int num) {
		int len = (int) Math.floor(Math.log10(num)) + 1;
		System.out.println("Length of input: " + len);
		int msb;
		msb = (int) Math.pow(10, len - 1);
		for (int i = 0; i < (len / 2); i++) {
			
			
			if (num/msb != num % 10) {
				return false;
			}
			
			num=num%msb;
			num=num/10;
			msb=msb/100;
		}
		return true;
	}

}
