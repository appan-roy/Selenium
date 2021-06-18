package interviewQnA;

public class SeparateNumericsAlphabetsSpecialChars2 {

	public static void main(String[] args) {

		String str = "SeLeNiUm&Java@2021";

		// separate special chars
		System.out.println(str.replaceAll("[a-zA-Z0-9]", ""));
		// separate numerics
		System.out.println(str.replaceAll("[^0-9]", ""));
		// separate alphabets
		System.out.println(str.replaceAll("[^a-zA-Z]", ""));

	}

}
