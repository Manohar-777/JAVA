package javaPraticalSession;
import java.util.*;
public class YearCalculation_Hard1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Days : ");
		int num = input.nextInt();
		
		int year = num/365;
		int week  =  (num%365)/7;
		int days = (num%365)%7;
		
		System.out.println("Total year : "+year);
		System.out.println("Total year : "+week);
		System.out.println("Total year : "+days);
		

	}

}
