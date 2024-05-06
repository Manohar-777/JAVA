package javaPraticalSession;
import java.util.*;
public class StringPalidrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = input.next();
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--) {
			str2 = str2+str.charAt(i);
		}
		System.out.println("The reversed string : "+str2);
		
		if(str.equals(str2)) {
			System.out.println("The String "+str+"is palindrom");
		}
		else {
			System.out.println("The String "+str+" is not a palindrom");
		}
	}

}
