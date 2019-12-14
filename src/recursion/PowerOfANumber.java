package recursion;

public class PowerOfANumber {

	public static void main(String[] args) {
		int number = 2, exponent = 10;
		PowerOfANumber obj = new PowerOfANumber();
		System.out
				.println("Value of " + number + " to the power of " + exponent + " is " + obj.power(number, exponent));

	}

	public int power(int number,int exponent) {
		if(exponent==1)
			return number;
		else
			return number*power(number,exponent-1);
	}

}
