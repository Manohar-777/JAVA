package javaPraticalSession;
import java.util.*;
import java.lang.*;
public class CountPrimeAndComposite {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the Number Enter \" exit \" to complete : ");
		while(true) {
			if(input.hasNextInt()) {
				list.add(input.nextInt());
			}
			else {
				String str = input.next();
				if("exit".equalsIgnoreCase(	str)) {
					break;
				}
				else {
					System.out.println("Invalid Input,please enter the number or enter \" exit\"");
				}
			}
		}
		System.out.println("You entered : "+list);
		int len = list.size();
		System.out.println("size : "+len);
		int prime =0,cons =0;
		check(list);
		
	}
	public static void check(ArrayList<Integer> a) {
		int cons=0,prime=0,c=0;
		for(int i=1;i<=a.size();i++) {
			for(int j=1;j<=a.indexOf(i);j++) {
				if(a.indexOf(i)%i==0) {
					c++;
				}
			}
			if(c>1) {
				cons++;
			}
			else {
				prime++;
			}
		}
		System.out.println("Composite number : "+cons);
		System.out.println("Prime number : "+prime);
	}
}
