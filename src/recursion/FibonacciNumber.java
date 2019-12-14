package recursion;

public class FibonacciNumber {

	public static void main(String[] args) {
		FibonacciNumber obj = new FibonacciNumber();
		for (int i = 0; i < 10; i++)
			System.out.print(obj.printFibonacci(i) + " ");
	}

	public int printFibonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return printFibonacci(n - 1) + printFibonacci(n - 2);
	}
}
