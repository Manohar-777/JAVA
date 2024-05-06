package Test_4;
class Bank{
	float getROI() {
		return (float) 0.0;
	}
}
class SBI extends Bank{
	float getROI(){
		return (float) 8.5; 
	}
}
class ICICI extends Bank{
	float getROI() {
		return (float) 7.9;
	}
}
class Axis extends Bank{
	float getROI() {
		return (float) 9.8;
	}
}
public class RateOfIntrest {

	public static void main(String[] args) {
		Axis a1 = new Axis();
		System.out.println("The Rate of intrest is : "+a1.getROI());

	}

}
