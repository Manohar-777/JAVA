import java.util.Scanner;
public class  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N value: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " digit number: ");
        int number = input.nextInt();
        int sum = calculateDigitSum(number);
        System.out.println("Sum of " + n + " digit number: " + sum);
        input.close();
    }
    static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
