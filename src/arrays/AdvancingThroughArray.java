package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class AdvancingThroughArray {

	public static void main(String[] args) {
		AdvancingThroughArray obj = new AdvancingThroughArray();
		Reader reader = new Reader();
		int testCaseCount;
		int size;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			size = reader.nextInt();

			int[] moves = new int[size];
			for (int i = 0; i < size; i++)
				moves[i] = reader.nextInt();

			System.out.println(obj.CanReachEndFromStart(moves, size));
		}

	}

	public boolean CanReachEndFromStart(int[] ar, int size) {
		int max;
		int max_Index = 0;
		int i = 0;

		while (i < size) {
			if (i == size - 1)
				return true;
			
			int k = ar[i];
			max = Integer.MIN_VALUE;
			for (int j = 1; (j <= k) && (i + j < size); j++) {
				if (max < ar[i + j] && ar[i + j] != 0) {
					max = ar[i + j];
					max_Index = i + j;
				}
			}
			if (i == max_Index)
				return false;
			else
				i = max_Index;
		}
		return false;
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
