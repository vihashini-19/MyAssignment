package week1.day2;

public class Calculator {
public int addition(int num1, int num2, int num3) {
	int sum=num1+num2+num3;
	System.out.println("sum of 3 numbers: "+sum);
	return sum;
}
public int subtraction(int num1, int num2) {
	int sub=num1-num2;
	System.out.println("subtraction of 2 numbers: "+sub);
	return sub;
}
public double multiplication(int num1, int num2) {
	double mul=num1*num2;
	System.out.println("multiplication of 2 numbers: "+mul);
	return mul;
}
public float divide(float num1, float num2) {
	float divide=num1/num2;
	System.out.println("divide of 2 numbers: "+divide);
	return divide;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.addition(1, 6, 8);
		calc.subtraction(12,20);
		calc.multiplication(1563,2634);
		calc.divide(232.02f,5.483f);
	}

}
