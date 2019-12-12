package primitive;

public class DivideTwoNumbers {
	public static void main(String[] args) {
		long x = 108125;
		long y = 625;
		long k = 32;
		long result = 0;
		long factor = y << k;
		while (x >= y) {
			while (factor > x) {
				factor = factor >> 1;
				k--;
			}
			result = result + (1L << k);
			x = x - factor;
		}
		
		System.out.println("Division gives: "+result);
	}
}
