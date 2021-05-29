package patternDemo;

import java.util.Scanner;

/*
1	1	1	1	1	
	2	2	2	2	
		3	3	3	
			4	4	
				5	
			4	4	
		3	3	3	
	2	2	2	2	
1	1	1	1	1
*/

public class Pattern48 {

	public static void main(String[] args) {
		
		int i,j,k,x,y,z;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of terms : ");
		
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			for(j=i;j>1;j--)
				System.out.printf("\t");
			
			for(k=i;k<=n;k++)
				System.out.printf("%d\t", i);
				
			System.out.println();
			
		}
		
		for(x=n-1;x>=1;x--) {
			
			for(y=x;y>1;y--)
				System.out.printf("\t");
			
			for(z=x;z<=n;z++)
				System.out.printf("%d\t", x);
			
			System.out.println();
			
		}

		sc.close();

	}

}
