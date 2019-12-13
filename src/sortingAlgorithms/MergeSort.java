package sortingAlgorithms;

import java.util.Scanner;

/*
 * 
 * First merge subarrays of size 1 to create sorted subarrays of size 2,
 * then merge subarrays of size 2 to create sorted subarrays of size 4,
 * and so on.
 * 
 *  @author garima.singh
 *
 * */
public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			MergeSort obj = new MergeSort();
			obj.mergeSortHelper(ar, sizeOfArray);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();
	}

	public void mergeSortHelper(int[] ar, int len) {

		for (int size = 1; size < len; size = 2 * size) {
			for (int left = 0; left < len - 1; left = left + (2 * size)) {
				int right = Math.min(left + (2 * size) - 1, len - 1);
				int mid = Math.min(left + size - 1, len - 1);

				merge(ar, left, mid, right);

			}

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
