package javaPraticalSession;
import java.util.*;
public class NumberOfSplCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String sen = input.nextLine();
		int n = sen.length();
		int ch =0;
		for(int i=0;i<n;i++) {
			if(!((sen.charAt(i)>='A' && sen.charAt(i)<='Z') || (sen.charAt(i)>=0 && sen.charAt(i)<=9) || (sen.charAt(i)>='a' && sen.charAt(i)<='z'))) {
				ch++;
			}
			else {
				continue;
			}
		}
		System.out.println("Total characters : "+ch);
	}

}
