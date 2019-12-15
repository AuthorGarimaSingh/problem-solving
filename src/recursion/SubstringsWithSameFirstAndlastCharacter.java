package recursion;

public class SubstringsWithSameFirstAndlastCharacter {

	public static void main(String[] args) {
		SubstringsWithSameFirstAndlastCharacter obj = new SubstringsWithSameFirstAndlastCharacter();
		String str = "abcab";
		System.out.println(obj.printAllPossibleStrings(str, 0, str.length() - 1, str.length()));

	}

	public int printAllPossibleStrings(String str, int start, int end, int length) {
		if (length == 1)
			return 1;
		if (length <= 0)
			return 0;

		int count = printAllPossibleStrings(str, start + 1, end, length - 1)
				+ printAllPossibleStrings(str, start, end - 1, length - 1)
				- printAllPossibleStrings(str, start + 1, end - 1, length - 2);

		if (str.charAt(start) == str.charAt(end))
			count++;

		return count;

	}

}
