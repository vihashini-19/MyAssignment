package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29,count=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("is a Prime Number: "+num);
		else
			System.out.println("is not a Prime Number: "+num);

	}

}
