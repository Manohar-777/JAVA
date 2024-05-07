import java.util.Scanner;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate and display factorial
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        scanner.close();
    }
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! and 1! are both 1
        } else {
            return n * calculateFactorial(n - 1); 
        }
    }
}