package sortingAlgorithms;

/*
 * a. Call the buildMaxHeap() 
 * b. Put the last element in the end and decrease the size of array
 * c. Call heapify every time and decrease the size of array
 * 
 * */
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
			obj.heapSortHelper(ar);
			for (int k = 0; k < sizeOfArray; k++)
				System.out.print(ar[k] + " ");
		}
		sc.close();

	}

	public void heapSortHelper(int[] ar) {
		buildMaxHeap(ar);
		int lastIndex = ar.length - 1;

		while (lastIndex > 0) {
			int temp = ar[0];
			ar[0] = ar[lastIndex];
			ar[lastIndex] = temp;

			heapify(ar, 0, lastIndex);

			lastIndex--;
		}

	}

	public void buildMaxHeap(int[] ar) {
		int size = ar.length;
		int loop = (size / 2) - 1;
		for (int i = loop; i >= 0; i--) {
			heapify(ar, i, size);
		}
	}

	public void heapify(int[] ar, int start, int end) {
		int largest, leftChild, rightChild;
		while (start < end) {
			largest = start;
			leftChild = (2 * start) + 1;
			rightChild = (2 * start) + 2;

			if (leftChild < end && ar[largest] < ar[leftChild])
				largest = leftChild;
			if (rightChild < end && ar[largest] < ar[rightChild])
				largest = rightChild;

			if (largest == start)
				return;
			else {
				int temp = ar[largest];
				ar[largest] = ar[start];
				ar[start] = temp;
			}

			start = largest;
		}
	}

}
