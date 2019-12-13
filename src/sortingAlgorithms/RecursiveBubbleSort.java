package sortingAlgorithms;

import java.util.Scanner;

/*
 * 
	Base Case: If array size is 1, return.
	Do One Pass of normal Bubble Sort. This pass fixes last element of current subarray.
	Recur for all elements except last of current subarray.
 	
 	@author garima.singh
 * */

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			RecursiveBubbleSort obj = new RecursiveBubbleSort();
			obj.resursiveBubbleSortHelper(ar, sizeOfArray);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();
	}

	public void resursiveBubbleSortHelper(int[] array, int size) {
		int temp;
		if (size == 1) {
			return;
		}
		for (int j = 0; j < size - 1; j++) {
			if (array[j] > array[j + 1]) {
				temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
			resursiveBubbleSortHelper(array, size - 1);
		}
	}
}
