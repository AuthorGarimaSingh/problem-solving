package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class BuySellStockOnce {

	public static void main(String[] args) {
		BuySellStockOnce obj = new BuySellStockOnce();
		Reader reader = new Reader();
		int testCaseCount;
		int size;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size = reader.nextInt();

			int[] num = new int[size];
			for (int i = 0; i < size; i++)
				num[i] = reader.nextInt();

			System.out.println(obj.maximumProfit(num, size));
		}

	}

	public int maximumProfit(int[] ar, int size) {
		int min = Integer.MAX_VALUE;
		int profit = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {
			if (min > ar[i]) {
				min = ar[i];
			} else {
				profit = Math.max(profit, ar[i] - min);
			}
		}
		return profit;
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
