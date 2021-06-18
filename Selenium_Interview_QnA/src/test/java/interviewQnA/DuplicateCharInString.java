package interviewQnA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {

		String str = "India is my country";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();

		for (Character ch : charArray) {
			if (baseMap.containsKey(ch)) {
				baseMap.put(ch, baseMap.get(ch) + 1);
			} else {
				baseMap.put(ch, 1);
			}
		}
		
		Set<Character> keys = baseMap.keySet();
		
		for (Character ch : keys) {
			if (baseMap.get(ch) > 1) {
				System.out.println(ch + "  occurred " + baseMap.get(ch) + " times");
			}
		}
		
	}
}
