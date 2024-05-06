package javaPraticalSession;
import java.util.*;
public class FindTheDay {
	public static void main(String[] args) {
		int date,month,year;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Date : ");
		date = input.nextInt();
		if(date>31) {
			System.out.println("Invalid Date...please enter valid date");
		}
		else {
			System.out.print("Enter the Month : ");
			month = input.nextInt();
			if(month>12) {
				System.out.println("Invalid Month... please enter the valid month");
			}
			else {
				System.out.print("Enter the Year between 1971 and 2100 only : ");
				year = input.nextInt();
				if(year>2100 || year<1971) {
					System.out.println("Invalid Year.. please enter the valid year.");
				}
				else {
					System.out.println(findDay(date,month,year));
				}
			}
		}
	}
	public static String findDay(int date,int month,int year) {
		String[] days = new String[] {"sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Calendar calendar = new GregorianCalendar(year,month-1,date);
		return days[calendar.get(Calendar.DAY_OF_WEEK)-1];
	}
}
