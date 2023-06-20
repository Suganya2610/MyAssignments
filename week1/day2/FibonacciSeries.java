package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int rangeNum=8, firstNum=0, secNum = 1, sumNum;
		
		System.out.print("Output: "+firstNum+" "+secNum);
		
		for(int i= 2; i<rangeNum; i++) {
			sumNum=firstNum+secNum;
			System.out.print(" "+sumNum);
			firstNum=secNum;
			secNum=sumNum;
		}
		
	}

}
