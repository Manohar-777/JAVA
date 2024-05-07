import java.util.Scanner;
public class SumofNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        System.out.println("Enter " + N + " numbers:");
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        try {
            int sum = calculateSum(numbers);
            System.out.println("Sum of " + N + " numbers: " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Loop variable went beyond the size of the array.");
        }
        scanner.close();
    }
    private static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length; i++) { 
            sum += array[i];
        }
        return sum;
    }
}