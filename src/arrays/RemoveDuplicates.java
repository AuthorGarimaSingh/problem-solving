package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		RemoveDuplicates obj = new RemoveDuplicates();
		Reader reader = new Reader();
		int testCaseCount;
		int size;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size = reader.nextInt();

			int[] duplicates = new int[size];
			for (int i = 0; i < size; i++)
				duplicates[i] = reader.nextInt();

			int newSize=obj.duplicateRemover(duplicates, size);
			for (int k = 0; k <= newSize; k++)
				System.out.print(duplicates[k] + " ");
			System.out.println();

		}
	}

	public int duplicateRemover(int[] ar, int size) {
		int j = 1;
		for (int i = 0; i < size; i++) {
			if (ar[j - 1] != ar[i])
				ar[j++] = ar[i];
		}
		return j-1;

	}

	private static class Reader {
		BufferedReader bufferedReader;
		LinkedList<String> inputToken;
		String line;
		boolean partial = false;

		public Reader() {
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(System.in, "utf-8"));
				inputToken = new LinkedList();
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
				partial = false;
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		private String nextToken() {
			if (inputToken.size() == 0) {
				readTokens();
			}
			partial = true;
			return inputToken.remove();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		@SuppressWarnings("unused")
		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		@SuppressWarnings("unused")
		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}

		@SuppressWarnings("unused")
		public String nextString() {
			return nextToken();
		}

	}

}
