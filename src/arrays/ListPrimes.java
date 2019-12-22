package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

/*
 * 	  Sieve of Eratosthenes	
 *  a. Create a list of consecutive integers from 2 to n: (2, 3, 4, …, n).
 *  b. Initially, let p equal 2, the first prime number.
 *  c. Starting from p2, count up in increments of p and mark each of these numbers
 *     greater than or equal to p2 itself in the list. These numbers will be p(p+1), p(p+2), p(p+3), etc..
 *  d. Find the first number greater than p in the list that is not marked. If there was no such number, stop.
 *     Otherwise, let p now equal this number (which is the next prime), and repeat from step 3.
 *     Time complexity : O(n*log(log(n)))
 */

public class ListPrimes {

	public static void main(String[] args) {
		ListPrimes obj = new ListPrimes();
		Reader reader = new Reader();
		int testCaseCount;
		int num;
		testCaseCount = reader.nextInt();
		while (testCaseCount-- > 0) {
			num = reader.nextInt();
			obj.primes(num);
		}

	}

	public void primes(int num) {
		boolean[] prime = new boolean[num + 1];

		for (int i = 0; i <= num; i++)
			prime[i] = true;

		for (int i = 2; i * i <= num; i++) {
			if (prime[i] == true) {
				for (int j = i * i; j <= num; j = j + i) {
					prime[j] = false;
				}
			}
		}

		for (int i = 2; i <= num; i++) {
			if (prime[i] == true) {
				System.out.print(i + " ");
			}
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
