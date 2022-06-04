package interviewQnATricky;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestTwoDigitNumberFromConsistentFragmentOfString {

	public static void main(String[] args) throws IOException {

		System.out.println(findGreatestTwoDigitNum("50552")); // 55
		System.out.println(findGreatestTwoDigitNum("10101")); // 10
		System.out.println(findGreatestTwoDigitNum("88")); // 88

	}

	static int findGreatestTwoDigitNum(String S) {

		List<String> list = new ArrayList<String>();
		List<Integer> intList = new ArrayList<Integer>();

		char[] chArr = S.toCharArray();

		for (int i = 0; i < chArr.length - 1; i++) {
			list.add(String.valueOf(chArr[i]) + String.valueOf(chArr[i + 1]));
		}

		for (String s : list) {
			intList.add(Integer.parseInt(s));
		}

		Collections.sort(intList);

		return intList.get(intList.size() - 1);

	}

}
