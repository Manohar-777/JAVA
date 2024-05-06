package test1;
import java.util.*;
public class TaxCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Total income : ");
		int income = input.nextInt();
		double tax = 0;
		if(income<=250000) {
			System.out.println("No Tax");
		}
		else if(income>250000 && income<=500000) {
			tax = (income-250000)*0.10+25000;
		}
		else if(income>500000 && income<=1000000) {
			tax = (income-500000)*0.20+15000;
		}
		else{
			tax = (income-1000000)*0.30+10000;
		}
		System.out.println("The total tax : "+tax);
		
		
	}

}
