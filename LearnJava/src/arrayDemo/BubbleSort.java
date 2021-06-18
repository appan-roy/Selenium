package arrayDemo;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter no. of elements you want in array:");
        
        int n = s.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter all the elements:");
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++) {
           for(int j = 1; j < n; j++) {
              if(arr[j-1] > arr[j]) {
                 int temp = arr[j-1];
                 arr[j-1] = arr[j];
                 arr[j] = temp;
              }
           }
        }
        
        System.out.println("The sorted array is : ");
        
        for(int i=0; i<n; i++)
        	System.out.print(arr[i]+" ");
        
        s.close();

	}

}
