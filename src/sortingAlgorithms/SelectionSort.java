package sortingAlgorithms;

import java.util.Scanner;

/**
 * Implements selection sorting algorithm. The algorithm sorts the array by
 * repeatedly finding the minimum element from unsorted array and putting it at
 * the beginning.
 * 
 * @author garima.singh
 * 
 * 
 * 
 */
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			SelectionSort obj = new SelectionSort();
			obj.selectionSortHelper(ar);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");

		}
		sc.close();

	}

	public void selectionSortHelper(int[] ar) {
		int len = ar.length;
		int temp, min_index;
		for (int i = 0; i < len; i++) {
			min_index = i;
			for (int j = i; j < len; j++) {
				if (ar[j] < ar[min_index])
					min_index = j;
			}
			temp = ar[i];
			ar[i] = ar[min_index];
			ar[min_index] = temp;
		}

	}

}
