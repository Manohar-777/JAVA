package javaPraticalSession;
import java.util.*;

class multi1 extends Thread{
	private int num,limit;
	
	public multi1(int n,int m) {
		this.num = n;
		this.limit = m;
	}
	
	public void run() {
		for(int i=1;i<=limit;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}
class multi2 extends Thread{
	private int num,limit;
	
	public multi2(int n,int m) {
		this.num = n;
		this.limit = m;
	}

	public void run() {
		for(int i=1;i<=limit;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}
}

public class ThreadMultiplication {

	public static void main(String[] args) throws InterruptedException {
		int n1,n2,m1,m2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the multiplication  number : ");
		n1 = input.nextInt();
		System.out.println("Enter the limit : ");
		m1 = input.nextInt();
		System.out.println("Enter the 2nd Number : ");
		n2 = input.nextInt();
		System.out.println("Enter the limit : ");
		m2 = input.nextInt();
		
		multi1 mul1 = new multi1(n1,m1);
		multi2 mul2 = new multi2(n2,m2);
		
		mul1.start();
		mul1.join();
		mul2.start();
	}
}
