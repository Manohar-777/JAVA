package javaPraticalSession;

import java.util.Scanner;
import java.lang.*;
public class ArrayBoundError {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the limit : ");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr[i] = i+1;
		}
		try {
			for(int i=0;i<=n;i++) {
				sum+=i;
			}
			System.out.println("total : "+sum);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();	
		}
		
		

	}

}
