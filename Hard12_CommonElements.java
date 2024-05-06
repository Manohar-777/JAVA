package javaPraticalSession;
import java.util.*;
public class CommonElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the first array : ");
		int s1 = input.nextInt();
		System.out.print("\n");
		System.out.print("Enter the size of the second array : ");
		int s2 = input.nextInt();
		String[] a = new String[s1];
		String[] b = new String[s2];
		System.out.print("\n");
		for(int i=0;i<s1;i++) {
			System.out.print("Enter the 1st array data - "+i+" :");
			a[i] = input.nextLine();
		}
		System.out.print("\n");
		for(int i=0;i<s2;i++) {
			System.out.print("Enter the 2nd array data - "+i+" :");
			b[i] = input.nextLine();
		}
		System.out.print("\n");
		for(int i=0;i<s1;i++) {
			for(int j=0;j<s2;j++) {
				if(a[i].equals(b[j])) {	
					System.out.println(a[i]+" ");
				}
			}
		}
		
	}

}
