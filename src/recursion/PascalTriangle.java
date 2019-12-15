package recursion;

public class PascalTriangle {

	public static void main(String[] args) {
		PascalTriangle obj = new PascalTriangle();
		obj.printPascalTriangle(5);
	}

	public void printPascalTriangle(int rows) {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j <= i; j++) {
				int numerator = factorial(i);
				int denominator = factorial(j) * factorial(i - j);
				System.out.print(numerator / denominator);
			}
			System.out.println();
		}

	}

	public int factorial(int num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

}
