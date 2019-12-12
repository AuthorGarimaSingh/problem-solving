package primitive;

public class NumbersWithSameWeight {

	public static void main(String[] args) {
		long num=6;
		System.out.println("Number is: "+num);
		for(int i=0;i<64;i++) {
			if(((num>>i)&1)!=((num>>(i+1))&1)) {
				long bitmask= (1L<<i)|(1L<<(i+1));
				num=num^bitmask;
				break;
			}
		}
		System.out.println("Number having same weight: "+num);
	}

}
