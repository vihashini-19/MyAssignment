package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnum=0, secondNum=1, sum=0;
		System.out.println(firstnum + " " + secondNum);
		for (int i=2; i<11; i++) {
			sum = firstnum + secondNum;
			System.out.println(" " + sum);
			firstnum=secondNum;
					secondNum= sum;
		}
	}

}
