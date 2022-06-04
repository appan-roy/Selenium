package interviewQnATricky;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestNumberAfterRemovingOne5 {

	public static void main(String[] args) {

		System.out.println(findGreatestNumAfterRemovingOne5(15958)); // 1958
		System.out.println(findGreatestNumAfterRemovingOne5(-5859)); // -589
		System.out.println(findGreatestNumAfterRemovingOne5(-5000)); // 0

	}

	static int findGreatestNumAfterRemovingOne5(int N) {

		String s = "";

		boolean flag = true;

		if (N < 0) {
			N = N * (-1);
			flag = false;
		}

		s = String.valueOf(N);

		List<Integer> idxList = new ArrayList<Integer>();
		List<String> strList = new ArrayList<String>();
		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '5')
				idxList.add(i);
		}

		for (Integer i : idxList) {
			StringBuilder sb = new StringBuilder(s);
			strList.add(sb.deleteCharAt(i).toString());
		}

		for (int i = 0; i < strList.size(); i++) {
			numList.add(Integer.parseInt(strList.get(i)));
		}

		Collections.sort(numList);

		if (flag)
			return numList.get(numList.size() - 1);
		else
			return numList.get(0) * (-1);

	}

}
