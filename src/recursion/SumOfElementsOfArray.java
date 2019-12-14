package recursion;

/*
 * Sum of elements of an array having size n recursively
 * 
 * @author garima.singh
 */

//How is stack maintained here

/*
 * Initially
 * SumOfElementsOfArray.min(int[],int) line:31
 * SumOfElementsOfArray.min(int[],int) line:34
 * SumOfElementsOfArray.min(int[],int) line:34
 * SumOfElementsOfArray.min(int[],int) line:34
 * SumOfElementsOfArray.min(int[],int) line:34
 * SumOfElementsOfArray.main(String[]) line:27
 * 
 */

public class SumOfElementsOfArray {

	public static void main(String[] args) {
		SumOfElementsOfArray obj = new SumOfElementsOfArray();
		int[] a = { 5, 4, 1, 2 };
		System.out.println("Sum of all elements: " + obj.sumOfArrayElements(a, a.length - 1));
	}

	public int sumOfArrayElements(int[] ar, int size) {
		if (size < 0)
			return 0;
		else
			return ar[size] + sumOfArrayElements(ar, size - 1);
	}

}
