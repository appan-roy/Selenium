package interviewQnA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingMinimumPositiveIntegerInArray {

	public static void main(String[] args) {
		
		int[] numbers1 = {1, 4, 5, 6, 1, 2};
		int[] numbers2 = {1, 2, 3};
		int[] numbers3 = {-1, -3};
		
		System.out.println(getMissingPosInt(numbers1)); // 3
		System.out.println(getMissingPosInt(numbers2)); // 4
		System.out.println(getMissingPosInt(numbers3)); // 1

	}

	static int getMissingPosInt(int[] A) {

		int missingNum = 1;

		List<Integer> list = new ArrayList<Integer>();
		for (Integer i : A) {
			if ((!list.contains(i)) & (i > 0)) {
				list.add(i);
			}
		}

		Collections.sort(list);

		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != (i + 1)) {
					missingNum = i + 1;
					break;
				} else {
					missingNum = list.size() + 1;
				}
			}
		} else {
			missingNum = list.size() + 1;
		}

		return missingNum;

	}

}
