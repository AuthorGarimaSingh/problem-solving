package recursion;

/*
 * Print sum of numbers from 1 to n recursively
 * 
 * @author garima.singh
 */

//How is stack maintained here

/*
 * Initially
 * SumOfNumbers.sum(int) line:30
 * SumOfNumbers.sum(int) line:33
 * SumOfNumbers.sum(int) line:33
 * SumOfNumbers.sum(int) line:33
 * SumOfNumbers.sum(int) line:33
 * SumOfNumbers.main(String[]) line:26
 * 
 */

public class SumOfNumbers {

	public static void main(String[] args) {
		SumOfNumbers obj = new SumOfNumbers();
		System.out.println(obj.sum(5)); // line 26
	}

	public int sum(int n) {
		if (n == 1) // line 30
			return 1;
		else
			return n + sum(n - 1); // line 33
	}

}
