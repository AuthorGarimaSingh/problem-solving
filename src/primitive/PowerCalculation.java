package primitive;

public class PowerCalculation {

	public static void main(String[] args) {
		double x = 52;
		int y = -3;
		long result = 1;
		int power = y;

		if (y < 0) {
			power = -y;
		}

		while (power > 0) {
			if ((power & 1) == 1) {
				result *= x;
			}
			x *= x;
			power >>= 1;
		}

		if (y > 0)
			System.out.println("Value of x^y is: " + result);
		else if (y < 0)
			System.out.println("Value of x^y is: " + (1.0 / result));
	}

}
