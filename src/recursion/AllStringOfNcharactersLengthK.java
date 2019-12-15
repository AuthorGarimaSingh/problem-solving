package recursion;

public class AllStringOfNcharactersLengthK {

	public static void main(String[] args) {
		AllStringOfNcharactersLengthK obj = new AllStringOfNcharactersLengthK();
		char[] set = { 'a', 'b' };
		int k = 3;
		obj.printAllPossibleStrings(set, k);

	}

	public void printAllPossibleStrings(char[] set, int k) {
		String result = "";
		int len = set.length;
		printAllPossibleStringsHelper(set, k, len, result);

	}

	public void printAllPossibleStringsHelper(char[] set, int k, int length, String result) {
		if (k == 0) {
			System.out.println(result);
			return;
		} else {
			for (int j = 0; j < length; j++) {
				String newResult = result + set[j];
				printAllPossibleStringsHelper(set, k - 1, length, newResult);
			}
		}

	}

}
