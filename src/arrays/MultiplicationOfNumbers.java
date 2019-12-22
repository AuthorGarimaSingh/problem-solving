package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class MultiplicationOfNumbers {

	public static void main(String[] args) {
		MultiplicationOfNumbers obj = new MultiplicationOfNumbers();
		Reader reader = new Reader();
		int testCaseCount;
		int size1, size2;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size1 = reader.nextInt();
			size2 = reader.nextInt();

			int[] num1 = new int[size1];
			for (int i = 0; i < size1; i++)
				num1[i] = reader.nextInt();

			int[] num2 = new int[size2];
			for (int i = 0; i < size2; i++)
				num2[i] = reader.nextInt();

			obj.multiply(num1, size1, num2, size2);
		}
	}

	public void multiply(int[] ar1, int len1, int[] ar2, int len2) {
		int product, carry, value, len;
		int size = len1 + len2;
		int i = 1;
		int[] result = new int[size];
		for (int k = len2 - 1; k >= 0; k--) {
			carry = 0;
			product = 0;
			value = 0;
			len = size - i;
			for (int j = len1 - 1; j >= 0; j--) {
				value = (ar2[k] * ar1[j]) + carry + result[len];
				carry = value / 10;
				product = value % 10;
				result[len] = product;
				len--;
			}
			if (carry > 0)
				result[len] = carry;
			i++;
		}

		for (int k = 0; k < size; k++)
			System.out.print(result[k] + " ");
		System.out.println();
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
