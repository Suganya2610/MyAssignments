package week1.day2;

public class CheckIfTheNumberIsPositiveOrNegative {

	public static void main(String[] args) {
		int num = -40;
		
		if(num<0) {
			num = num * -1;
			System.out.println("The negative number is converted to positive: "+num);
			}
		else {
			System.out.println("The number provided is not negative: "+num);
		}
	}

}
