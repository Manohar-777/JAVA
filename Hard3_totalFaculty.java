package javaPraticalSession;
import java.util.*;
public class totalFaculty {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total Count : ");
		int total = input.nextInt();
		System.out.println("Enter the total faculty: ");
		int staff = input.nextInt();
		
		int non_teaching = staff/3;
		
		int students = total - (staff+non_teaching); 
		
		System.out.println("Total user : "+total);
		System.out.println("Staff user : "+staff);
		System.out.println("Staff user : "+non_teaching);
		System.out.println("Student user : "+students);
	}

}
