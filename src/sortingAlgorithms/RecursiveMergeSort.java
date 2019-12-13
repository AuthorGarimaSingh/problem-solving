package sortingAlgorithms;

import java.util.Scanner;

/*
 * Merge Sort is a Divide and Conquer algorithm. 
 * It divides input array in two halves, calls itself for the two halves
 * and then merges the two sorted halves.
 * 
 * @author garima.singh
 */

public class RecursiveMergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			RecursiveMergeSort obj = new RecursiveMergeSort();
			obj.recursiveSortHelper(ar, 0, sizeOfArray - 1);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();
	}

	public void recursiveSortHelper(int[] ar, int low, int high) {
		if (low < high) {
			int mid = (high + low) / 2;
			recursiveSortHelper(ar, low, mid);
			recursiveSortHelper(ar, mid + 1, high);
			merge(ar, low, mid, high);
		}
	}

	public void merge(int[] ar, int l, int m, int r) {
		int size1 = m - l + 1;
		int size2 = r - m;
		int i, j, k;

		int[] L = new int[size1];
		int[] R = new int[size2];

		for (i = 0; i < size1; i++) {
			L[i] = ar[l + i];
		}

		for (j = 0; j < size2; j++) {
			R[j] = ar[m + 1 + j];
		}

		i = 0;
		j = 0;
		k = l;

		while (i < size1 && j < size2) {
			if (L[i] > R[j]) {
				ar[k] = R[j];
				j++;
			} else if (L[i] <= R[j]) {
				ar[k] = L[i];
				i++;
			}
			k++;
		}

		while (i < size1) {
			ar[k] = L[i];
			k++;
			i++;
		}

		while (j < size2) {
			ar[k] = R[j];
			k++;
			j++;
		}

	}

}
