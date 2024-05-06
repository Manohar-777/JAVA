public class ArmstrongNumbers{
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 100:");
        for (int num = 1; num <= 100; num++) {
            int originalNum = num;
            int digits = 0;
            int temp = num;
            while (temp != 0) {
                temp /= 10;
                digits++;
            }
            int sum = 0;
            temp = originalNum;
            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == originalNum) {
                System.out.print(num + " ");
            }
        }
    }
}
