package recursion;

/*
 * Print numbers from 1 to n recursively
 * 
 * @author garima.singh
 */

//How is stack maintained here

/*
 * Initially
 * PrintNumbers.print(int) line:31
 * PrintNumbers.print(int) line:34
 * PrintNumbers.print(int) line:34
 * PrintNumbers.print(int) line:34
 * PrintNumbers.print(int) line:34
 * PrintNumbers.main(String[]) line:27
 * 
 */

public class PrintNumbers {

	public static void main(String[] args) {
		PrintNumbers obj = new PrintNumbers();
		obj.print(5); // line 27
	}

	public void print(int n) {
		if (n < 1) { // line 31
			return;
		}
		print(n - 1); // line 34
		System.out.println(n);
	}

}
