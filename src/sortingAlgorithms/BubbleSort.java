package sortingAlgorithms;

import java.util.Scanner;

/**
 * Implements bubble sorting algorithm. The algorithm sorts the array by
 * repeatedly swapping the adjacent elements if they are in wrong order
 * 
 * @author garima.singh
 * 
 * 
 * 
 */

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			BubbleSort obj = new BubbleSort();
			obj.bubbleSortHelper(ar);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");

		}
		sc.close();
	}

	public void bubbleSortHelper(int[] ar) {
		int len = ar.length;

		int temp;
		int swap;

		for (int i = 0; i < len - 1; i++) {
			swap = 0;
			for (int j = 0; j < len - 1; j++) {
				if (ar[j] > ar[j + 1]) {

					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
					swap++;

				}
			}
			System.out.println("Iteration: " + (i + 1) + " Swaps done: " + swap);
			if (swap == 0)
				break;

		}
	}

}
