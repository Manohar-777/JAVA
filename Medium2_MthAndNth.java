package javaPraticalSession;
import java.util.*;
public class MthAndNth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter \"exit\" once data over..");
		System.out.println("Enter the number : ");
		while(true) {
			if(input.hasNextInt()) {
				list.add(input.nextInt());
			}
			else {
				String str = input.next();
				if("exit".equalsIgnoreCase(str)) {
					break;
				}
				else {
					System.out.println("Invalid input please enter the number or exit...");
				}
			}
		}
		int n = list.size();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(list.get(i)>list.get(j)) {
					int temp = list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
		}
		System.out.println("Enter the Nth number : ");
		int Nth = input.nextInt();
		System.out.println("Enter the Mth number : ");
		int Mth = input.nextInt();
		System.out.println("sorted list : "+list);
		System.out.println("the "+Nth+" maximum number is : "+list.get(Nth));
		System.out.println("the "+Mth+" minimum number is : "+list.get(Mth));
		System.out.println("sum = "+(list.get(Nth)+list.get(Mth)));
		
	}

}
