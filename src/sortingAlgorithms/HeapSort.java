package sortingAlgorithms;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sizeOfArray, testCaseCount;

		testCaseCount = sc.nextInt();

		while (testCaseCount-- > 0) {
			sizeOfArray = sc.nextInt();

			int[] ar = new int[sizeOfArray];
			for (int k = 0; k < sizeOfArray; k++)
				ar[k] = sc.nextInt();
			HeapSort obj = new HeapSort();
			obj.buildHeap(ar);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();

	}

	public void buildHeap(int[] ar) {
		int len = ar.length;
		int loop = (ar.length / 2) - 1;
		for (int i = loop; i >= 0; i--) {
			heapify(ar, len, i);
		}

		// Swap the first element of the list with the final element. Decrease the
		// considered range of the list by one.
		for (int i = len - 1; i >= 0; i--) {

			int temp = ar[0];
			ar[0] = ar[i];
			ar[i] = temp;

			heapify(ar, i, 0);
		}

	}

	public void heapify(int[] ar, int len, int i) {

		int largest = i;
		int leftChild = (2 * i) + 1;
		int rightChild = (2 * i) + 2;
		if (leftChild < len && ar[leftChild] > ar[largest])
			largest = leftChild;

		if (rightChild < len && ar[largest] < ar[rightChild])
			largest = rightChild;

		if (largest != i) {
			int temp = ar[i];
			ar[i] = ar[largest];
			ar[largest] = temp;

			heapify(ar, len, largest);
		}

	}

}
