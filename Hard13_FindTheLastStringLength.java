package ClassTest;
import java.util.*;
public class Test1_FindTheLastStringLength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = input.nextLine();
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(str.split(" ")));
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				System.out.println("The last word : "+list.get(i));
				String str1 = list.get(i);
				int n = str1.length();
				System.out.println("And the length is : "+n);
			}
		}
			

	}

}
