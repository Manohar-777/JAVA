import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        String str = sc.nextLine();
        String temp = " ";
       for(int i=str.length()-1;i>=0;i--){
           temp+=str.charAt(i);
       }
       System.out.println(temp);
    }
}