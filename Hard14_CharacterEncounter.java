package javaPraticalSession;
import java.util.*;
public class CharacterEncounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Character> charlist = new ArrayList<>();
		int num=0,up=0,low=0;
		System.out.println("enter * to exit...");
		while(true) {
			System.out.print("Enter the Character : ");
			char ch = input.next().charAt(0);
			if(Character.isDigit(ch)) {
				num++;
			}
			else if(Character.isLetter(ch)) {
					if(ch>='A' && ch<='Z') {
						up++;
					}
					else {
						low++;
					}
			}
			else {
				if(ch=='*') {
					break;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("The total number of Upper case is : "+up);
		System.out.println("The total number of Lowercase is : "+low);
		System.out.println("The total number of numbers is : "+num);
	}

}
