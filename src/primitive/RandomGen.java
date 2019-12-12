package primitive;

import java.util.Random;

public class RandomGen {
	Random random = new Random();

	public static void main(String[] args) {
		RandomGen randomGen = new RandomGen();
		System.out.println("Random Number: " + randomGen.getRandomUsingZeroOne(10, 20));
		System.out.println("Random Number: " + randomGen.getRandomUsingZeroN(10, 20, 3));
	}

	public int getRandomUsingZeroOne(int lower, int upper) {
		int range = upper - lower + 1;
		int result = 0;
		for (int i = 0; (2 << i) < range; i++) {
			int value = zeroOne();
			result = result ^ (value << i);
		}
		result += lower;
		return result;
	}

	public int getRandomUsingZeroN(int lower, int upper, int n) {
		int value=zeroN(3);
		return 0;
	}

	public int zeroOne() {
		int value = random.nextInt() & Integer.MAX_VALUE;
		return value % 2;
	}

	public int zeroN(int n) {
		int value = random.nextInt() & Integer.MAX_VALUE;
		return value % n;
	}
}
