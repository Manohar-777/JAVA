
package javaPraticalSession;

import java.util.Scanner;

class fibo implements Runnable{

	private int limit;
	
	public fibo(int n) {
		this.limit = n;
	}
	public void run() {
		int num1 =0,num2=1,next =num1+num2;
		System.out.print("The "+limit+" fibonaaci series are : ");
		System.out.print(num1+" "+num2);
		for(int i=2;i<limit;i++) {
			System.out.print(" "+next);
			num1 = num2;
			num2 = next;
			next =num1+num2;
		}
		System.out.println();
	}
	
}
public class runnableFibonaaciSeries {
	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter the Limit of Fibonaaci : ");
		int n = input.nextInt();
		Thread thread1 = new Thread(new fibo(n));
		thread1.start();
	}
}
