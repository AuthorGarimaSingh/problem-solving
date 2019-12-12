package primitive;

public class CheckParityUsingLookupTable {

	public static void main(String[] args) {
		int[] BitsSetTable256=new int[256];
		BitsSetTable256[0] = 0;
		for (int i = 0; i < 256; i++)
		{
		  BitsSetTable256[i] = (i & 1) + BitsSetTable256[i / 2];
		}
		
//		for (int i = 0; i < 256; i++)
//		{
//		  System.out.println("BitsSetTable256["+i+"]:"+BitsSetTable256[i]);
//		}
		
		int number=255;
		int setBitsCount=BitsSetTable256[number & 0xfff]
				    	^ BitsSetTable256[(number>>8) & 0xfff]
				    	^ BitsSetTable256[(number>>16) & 0xfff]
				    	^ BitsSetTable256[(number>>24)];
		System.out.println("Parity of "+number+" is: "+(setBitsCount&1));

	}

}
