package sortingAlgorithms;

public class RecursiveQuickSort {

	public static void main(String[] args) {
		RecursiveQuickSort obj = new RecursiveQuickSort();
		int[] ar = { 4, 2, 12, 5, 23, 6, 1 };
		int len = ar.length;
		obj.quickSort(ar, 0, len - 1);

		for (int k = 0; k < ar.length; k++)
			System.out.print(ar[k] + " ");
	}

	public void quickSort(int[] ar, int low, int high) {
		if (low < high) {
			int pi = partition(ar, low, high);
			quickSort(ar, low, pi - 1);
			quickSort(ar, pi + 1, high);
		}

	}

	public int partition(int[] ar, int low, int high) {
		int pivot = ar[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (ar[j] < pivot) {
				i++;
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;

			}
		}

		int temp = ar[i + 1];
		ar[i + 1] = ar[high];
		ar[high] = temp;

		return i + 1;

	}

}
