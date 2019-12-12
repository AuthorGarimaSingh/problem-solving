package primitive;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		long a=1251;long b=1251;long sum=0;
		for(int i=0;i<64;i++) {
			if(((a>>i)&1)==1){
				sum+=b<<i;
			}
			
		}
		System.out.println("Multiplication result is: "+sum);

	}

}
