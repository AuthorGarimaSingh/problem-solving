package primitive;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=4132;
		int reversedNumber=0;
		while(num>0) {
			reversedNumber=reversedNumber*10+(num%10);
			num=num/10;
		}
		System.out.println("Reversed Number is: "+reversedNumber);

	}

}
