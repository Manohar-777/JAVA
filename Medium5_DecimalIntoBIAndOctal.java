package javaPraticalSession;
import java.util.*;
public class DecimalIntoBIAndOctal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Decimal value : ");
		int decimal = input.nextInt();
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		System.out.println("The binary value of "+decimal+" is : "+binary);
		System.out.println("The binary value of "+decimal+" is : "+octal);		
	}

}
