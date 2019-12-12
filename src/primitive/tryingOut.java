package primitive;

public class tryingOut {

	public static void main(String[] args) {
		System.out.println("Bit-wise AND: " + (6 & 2));
		System.out.println("Bit-wise OR: " + (4 | 6));
		// if x>>y, then it is equivalent to x/(2^y)
		System.out.println("Bit-wise RIGHT SHIFT: " + (32 >> 2));
		// if x<<y, then it is equivalent to x*(2^y)
		System.out.println("Bit-wise LEFT SHIFT: " + (3 << 10));
		// Simply flip the bits
		// Check
		// https://stackoverflow.com/questions/791328/how-does-the-bitwise-complement-operator-tilde-work
		System.out.println("Bit-wise Negation: " + (~28));
		// to get lowest set bit, perform AND on original number and 2's complement
		// (flip bits and add 1)
		System.out.println("Lowest set bit value: " + (4 & ~(4 - 1)));// this gives the value of set bit
		System.out.println("Lowest set bit index: " + (int) (Math.log10(4 & ~(4 - 1)) / Math.log10(2)));// this gives
																										// the index of
																										// set bit
		// check
		// https://stackoverflow.com/questions/4318263/java-subtract-0-from-char-to-get-an-int-why-does-this-work
		char a = '1';
		System.out.println("Converting char to integer: " + (a - '0'));

		// drop lowest set bit
		// n-1 would have all the bits flipped after the rightmost set bit (including
		// the set bit)
		// n =100010110
		// n-1=100010101
		// if there are k set bits, the iteration will run k times, complexity = O(k)
		System.out.println("Dropping lowest set bit: " + (278));
		System.out.println("Dropping lowest set bit: " + (278 - 1));
		System.out.println("Dropping lowest set bit: " + (278 & (278 - 1)));

		//proving that time complexity is O(k)
		int x = 278;
		int count = 0;
		while (x > 0) {
			x &= x - 1;
			System.out.println("Now x is: "+x);
			count++;
		}
		System.out.println("Set bits: "+count);
	}

}
