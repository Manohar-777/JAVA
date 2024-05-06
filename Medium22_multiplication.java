package ModelExam;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the table Number :");
		int n = input.nextInt();
		System.out.println("Enter the limit Number :");
		int m = input.nextInt();
		
		for(int i=1;i<=m;i++) {
			System.out.println(n+" X "+i+" = "+(n*i));
		}

	}

}
