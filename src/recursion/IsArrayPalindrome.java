package recursion;

/*
* Find if an array of size n is palindrome recursively
* 
* @author garima.singh
*/

//How is stack maintained here

/*
* Initially
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:41
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindromeHelper(char[],int,int) line:43
* IsArrayPalindrome.isPalindrome(char[],int) line:36
* IsArrayPalindrome.main(String[]) line:31
* 
*/

public class IsArrayPalindrome {

	public static void main(String[] args) {
		IsArrayPalindrome obj = new IsArrayPalindrome();
		char[] ch = { 'm', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm' };
		System.out.println("Is Array Palindrome? " + obj.isPalindrome(ch, ch.length - 1));

	}

	public boolean isPalindrome(char[] ch, int size) {
		return isPalindromeHelper(ch, 0, size);
	}

	public boolean isPalindromeHelper(char[] ch, int index, int size) {
		if (size == 1)
			return true;
		if (ch[index] == ch[size])
			return isPalindromeHelper(ch, index + 1, size - 1);
		return false;

	}

}
