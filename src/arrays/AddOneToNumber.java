package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class AddOneToNumber {

	public static void main(String[] args) {
		AddOneToNumber obj = new AddOneToNumber();
		Reader reader = new Reader();
		int testCaseCount;
		int size;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size = reader.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = reader.nextInt();
			}
			obj.addOne(arr, size);
		}
	}

	public void addOne(int[] ar, int size) {
		int[] next = new int[size + 1];
		int value = ar[size - 1] + 1;
		int carry = value / 10;
		next[size] = value % 10;
		for (int i = size - 2; i >= 0; i--) {
			value = carry + ar[i];
			carry = value / 10;
			next[i + 1] = value % 10;
		}
		if (carry > 0)
			next[0] = carry;

		for (int k = 0; k <= size; k++)
			System.out.print(next[k] + " ");
		System.out.println();

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

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}

		public String nextString() {
			return nextToken();
		}

	}

}
