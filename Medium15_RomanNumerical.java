package test1;
import java.util.*;

public class RomanNumerical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I = 1 \n V = 5 \n X = 10 \n L = 50 \n C = 100 \n D = 500 \n M = 1000");
        System.out.println("Enter the Numerical in capital letter : ");
        String str = input.nextLine();
        int sum = 0;
        String str1 = str.toUpperCase();
        int n = str1.length();
        for(int i = n - 1; i >= 0; i--) {
            switch(str1.charAt(i)) {
                case 'I':
                    sum += (sum >= 5 ? -1 : 1);
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += (sum >= 50 ? -10 : 10);
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += (sum >= 500 ? -100 : 100);
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }
        }
        System.out.println("The value is : " + sum);
    }
}
