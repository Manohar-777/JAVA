package javaPraticalSession;
import java.util.*;
public class duplicateArray {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the size of the array : ");
		 int n = input.nextInt();
		 Integer[] num = new Integer[n];
		 for(int i=0;i<n;i++) {
			 System.out.print("Enter the number : ");
			 num[i] = input.nextInt();
		 }
		 Integer[] uniqueNumber = Arrays.stream(num).distinct().toArray(Integer[]::new);
		 System.out.println("The real elements : ");
		 System.out.println(Arrays.toString(uniqueNumber));
	}
}