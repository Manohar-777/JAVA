package javaPraticalSession;
import java.util.*;
public class PositiveNegative {
	public  static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter -1 to exit....");
		boolean bool=true;
		while(bool) {
			System.out.print("Enter the number : ");
			int num = input.nextInt();
			if(num == -1) {
				bool=false;
				break;
			}
			else {
				list.add(num);
			}
		}
		double sum1=0.0,sum2=0.0;
		int pos=0,neg=0;
		int n = list.size();
		for(int i=0;i<n;i++){
			if(list.get(i)<0) {
				sum1= sum1+list.get(i);
				neg++;
			}
			else {
				sum2=sum2+list.get(i);
				pos++;
			}
		}
		System.out.println("Total positive values : "+pos);
		System.out.println("Total Negative Values : "+neg);
		System.out.println("Average positive values : "+sum2/pos);
		System.out.println("Average Negative Values : "+sum1/neg);
		
	}
}
