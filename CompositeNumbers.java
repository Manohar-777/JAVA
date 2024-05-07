import java.util.Scanner;
public class CompositeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lower bound (a): ");
        int a = input.nextInt();
        System.out.print("Enter the upper bound (b): ");
        int b = input.nextInt();
        System.out.println("Composite numbers between " + a + " and " + b + ":");
        printCompositeNumbers(a, b);
        input.close(); 
    }
    static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; 
            }
        }
        return false;
    }
    static void printCompositeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isComposite(i)) {
                System.out.println(i);
            }
        }
    }
}
