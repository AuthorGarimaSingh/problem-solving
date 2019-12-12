package primitive;

public class SwapIndividualBits {

	public static void main(String[] args) {
		long num=168;
		int index1=3,index2=6;
		if(((num>>index1)&1)!=((num>>index2)&1)) {
			int bitmask=(int) ((1L<<index1)|(1L<<index2));
			num=num^bitmask;
		}
		System.out.print("Number after swapping: "+num);

	}

}
