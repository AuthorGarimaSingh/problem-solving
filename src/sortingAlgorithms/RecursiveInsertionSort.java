package sortingAlgorithms;

import java.util.Scanner;
/*
 * 
	Base Case: If array size is 1 or smaller, return.
	Recursively sort first n-1 elements.
	Insert last element at its correct position in sorted array
 * 	@author garima.singh
 * */

public class RecursiveInsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			RecursiveInsertionSort obj = new RecursiveInsertionSort();
			obj.recursiveInsertionSortHelper(ar, sizeOfArray);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();
	}

	public void recursiveInsertionSortHelper(int[] ar, int size) {
		if (size <= 1)
			return;

		recursiveInsertionSortHelper(ar, size - 1);

		int temp = ar[size - 1];
		int j = size - 2;

		while ((j >= 0) && (ar[j] > temp)) {
			ar[j + 1] = ar[j];
			j--;
		}
		ar[j + 1] = temp;
	}

}
