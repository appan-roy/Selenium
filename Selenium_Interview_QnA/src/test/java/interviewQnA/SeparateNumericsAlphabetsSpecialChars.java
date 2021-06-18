package interviewQnA;

public class SeparateNumericsAlphabetsSpecialChars {

	public static void main(String[] args) {

		String str = "4BU85C";

		// METHOD 1
		// separate numerics
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if ((int) ch >= 48 && (int) ch <= 57) {
				System.out.print(ch);
			}

		}
		System.out.println();

		// separate alphabets
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (!((int) ch >= 48 && (int) ch <= 57)) {
				System.out.print(ch);
			}

		}
		System.out.println();

		// METHOD 2
		// separate numerics
		System.out.println(str.replaceAll("[A-Z]", ""));
		// separate alphabets
		System.out.println(str.replaceAll("[0-9]", ""));

		// METHOD 3
		// separate numerics
		System.out.println(str.replaceAll("[^0-9]", ""));
		// separate alphabets
		System.out.println(str.replaceAll("[^A-Z]", ""));

	}

}
