import java.util.Scanner;

public class LastTwoDigit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int lasttwo = year % 100;
        System.out.print("The last two numbers are: "+lasttwo);
    }
}
