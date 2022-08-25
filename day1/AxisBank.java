package week3.day1;

public class AxisBank extends BankInfo {
	public void deposite()
	{
		System.out.println("Deposite in Account:10000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank axis=new AxisBank();
		axis.savings();
		axis.fixed();
		axis.deposite();

	}

}
