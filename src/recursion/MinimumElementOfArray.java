package recursion;

/*
 * Minimum of an array having size n recursively
 * 
 * @author garima.singh
 */

//How is stack maintained here

/*
 * Initially
 * MinimumElementOfArray.min(int[],int) line:32
 * MinimumElementOfArray.min(int[],int) line:35
 * MinimumElementOfArray.min(int[],int) line:35
 * MinimumElementOfArray.min(int[],int) line:35
 * MinimumElementOfArray.min(int[],int) line:35
 * MinimumElementOfArray.main(String[]) line:27
 * 
 */

public class MinimumElementOfArray {

	public static void main(String[] args) {
		MinimumElementOfArray obj = new MinimumElementOfArray();
		int[] a = { 5, 4, 2, 3 };
		System.out.println("Minimum is: " + obj.min(a, a.length - 1));

	}

	public int min(int[] ar, int size) {
		if (size < 0) {
			return Integer.MAX_VALUE;
		} else
			return Math.min(ar[size], min(ar, size - 1));

	}

}
