package interviewQnA;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		// Integer Array
		int[] intArr = {67, 34, 89, 12, 76, 9, 26, 54};
		Arrays.sort(intArr);
		for(int x : intArr) System.out.print(x+", ");
		System.out.println();
		
		// String array
		String[] strArr = {"Selenium", "Cucumber", "Java", "TestNG", "JUnit", "Maven", "Jenkins", "Git"};
		Arrays.sort(strArr);
		for(String str : strArr) System.out.print(str+", ");
		System.out.println();

	}

}
