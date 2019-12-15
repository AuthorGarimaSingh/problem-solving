package recursion;

public class GCD {

	public static void main(String[] args) {
		GCD obj = new GCD();
		int a = 9, b = 36;
		System.out.println("GCD of " + a + " and " + b + " is " + obj.findGCD(a, b));
	}

	public int findGCD(int num1, int num2) {
		if (num2 == 0)
			return num1;
		else
			return findGCD(num2, num1 % num2);

	}

}
