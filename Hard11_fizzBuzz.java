package javaPraticalSession;
import java.util.*;
public class fizzBuzz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = input.nextInt();
		String[] numbers = new String[n+1];
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				numbers[i]="FizzBuzz";
			}
			else if(i%3==0) {
				numbers[i]="Fizz";
			}
			else if(i%5==0) {
				numbers[i]="Buzz";
			}
			else {
				numbers[i]=Integer.toString(i);
			}
		}
		System.out.print("[ ");
		for(int i=1;i<=n;i++) {
			System.out.print("\""+numbers[i]+"\", ");
		}
		System.out.print(" ]");
		
	}

}
