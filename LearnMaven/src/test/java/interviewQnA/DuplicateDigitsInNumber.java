package interviewQnA;

public class DuplicateDigitsInNumber {

	public static void main(String[] args) {
		
		int n = 26393529;
		String str = Integer.toString(n);
		
		// Method 1
		for(int i = 0; i < str.length(); i++) {
			int counter = 1;
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j)) counter++;
			}
			if(counter != 1) System.out.println("Char " + str.charAt(i) + " occurred " + counter + " times");
		}
		
		// Method 2
		char[] chArr = str.toCharArray();
		
		for(int i = 0; i < chArr.length; i++) {
			int counter = 1;
			for(int j = i+1; j < chArr.length; j++) {
				if(chArr[i] == chArr[j]) counter++;
			}
			if(counter != 1) System.out.println("Char " + str.charAt(i) + " occurred " + counter + " times");
		}
		
	}
}
