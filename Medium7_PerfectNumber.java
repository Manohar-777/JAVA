package javaPraticalSession;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = input.nextInt();
		int sum=0,temp=0;	
		for(int i=2;temp<n;i++) {
			sum = 1;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					if(j*j!=i) {
						sum+=j+i/j;
					}
					else {
						sum+=j;
					}
				}
			}
			if(sum == i) {
				System.out.println(i+" ");
				temp++;
			}
		}
	}
}
