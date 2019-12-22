package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

/*
 * 
 * By definition N! permutations of a length N array - N choices for the first slot, N-1 choices for the 2nd, etc.
 * 
 * So, we can break an algorithm down into these steps for each index i in the array:
 * 
 * a. Select an element in the sub-array arr[i....end] to be the ith element of the array. 
 * b. Swap that element with the element currently at arr[i].
 * c. Recursively permute arr[i+1...end].
 * 
 * We note that this will run in O(N!), as on the 1st call N sub calls will be made,
 * each of which will make N-1 sub calls, etc. 
 * Moreover, every element will end up being in every position, 
 * and so long as only swaps are made no element will ever be duplicated.
 * */

public class PermuteArray {

	public static void main(String[] args) {
		PermuteArray obj = new PermuteArray();
		Reader reader = new Reader();
		int testCaseCount;
		int size;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size = reader.nextInt();

			int[] num = new int[size];
			for (int i = 0; i < size; i++)
				num[i] = reader.nextInt();

			obj.permute(num);
		}

	}

	public void permute(int[] ar) {
		permuteHelper(ar, 0);
	}

	public void permuteHelper(int[] ar, int k) {
		if (k >= ar.length - 1) {
			for (int i = 0; i < ar.length; i++)
				System.out.print(ar[i] + " ");
			System.out.println();
			return;
		}

		for (int i = k; i < ar.length; i++) {
			int temp = ar[k];
			ar[k] = ar[i];
			ar[i] = temp;

			permuteHelper(ar, k + 1);

			temp = ar[k];
			ar[k] = ar[i];
			ar[i] = temp;

		}

	}

	private static class Reader {
		BufferedReader bufferedReader;
		LinkedList<String> inputToken;
		String line;

		public Reader() {
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
				inputToken = new LinkedList<String>();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		private void readTokens() {
			try {
				line = bufferedReader.readLine();
				// System.out.println(line);
				for (String s : line.split("\\s")) {
					inputToken.add(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		private String nextToken() {
			if (inputToken.size() == 0) {
				readTokens();
			}
			return inputToken.remove();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

	}

}
