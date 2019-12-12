package primitive;

public class Parity {

	public static void main(String[] args) {
		int result=0;
		int x=5;
		while(x>0) {
			//^ is XOR operator
			result^=(x&1);
			System.out.println((x&1)+"  "+result);
			x=x>>1;
		}
		System.out.println(result);

	}

}
