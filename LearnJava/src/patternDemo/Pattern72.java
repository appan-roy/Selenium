package patternDemo;

import java.util.Scanner;

/*
1	1	1	1	1	1	1	1	1	1	1	
	2	2	2	2	2	2	2	2	2	
		3	3	3	3	3	3	3	
			4	4	4	4	4	
				5	5	5
*/

public class Pattern72 {

	public static void main(String[] args) {
		
		int i,j,k;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j>1;j--)
				System.out.printf("\t");
			
			for(k=1;k<=(2*n+1)-((i-1)*2);k++)
				System.out.printf("%d\t", i);
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
