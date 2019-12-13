package sortingAlgorithms;

import java.util.Scanner;

/*
  The insertion sort, although still 𝑂(𝑛2), works in a slightly different way.
  It always maintains a sorted sublist in the lower positions of the list.
  Each new item is then “inserted” back into the previous sublist such that the sorted sublist is one item larger.
 * @author garima.singh
 * */
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			InsertionSort obj = new InsertionSort();
			obj.insertionSortHelper(ar);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();
	}

	public void insertionSortHelper(int[] ar) {
		int len = ar.length;
		int temp;
		for (int i = 1; i < len; i++) {
			temp = ar[i];
			int j = i - 1;
			while ((j >= 0) && (ar[j] > temp)) {
				ar[j + 1] = ar[j];
				j--;
			}
			ar[j + 1] = temp;
		}
	}

}
