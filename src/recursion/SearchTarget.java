package recursion;

public class SearchTarget {

	public static void main(String[] args) {
		SearchTarget obj = new SearchTarget();
		int[] a = { 2, 4, 9, 13, 25, 32 };
		int size = a.length - 1;
		int k = 32;
		System.out.println("Index of " + k + " in the given array is " + obj.getIndex(a, size, k));

	}

	public int getIndex(int[] ar, int size, int k) {
		return getIndexHelper(ar, 0, size, k);
	}

	public int getIndexHelper(int[] ar, int start, int end, int k) {
		int mid = start + ((end - start) / 2);
		if (k == ar[mid])
			return mid;
		else if (k < ar[mid])
			return getIndexHelper(ar, start, mid - 1, k);
		return getIndexHelper(ar, mid + 1, end, k);
	}

}
