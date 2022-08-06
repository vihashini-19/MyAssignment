package week1.day1;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class TwoWheeler {
int noOfwheels=2;
short noOfMirrors=2;
long chassisNumber=98765432l;
boolean isPunctured=true;
String bikeName="YAMAHA";
double runningKM=5632.01;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwoWheeler twowheeler = new TwoWheeler();
System.out.println("Wheels:" + twowheeler.noOfwheels);
System.out.println("Mirror:" + twowheeler.noOfMirrors);
System.out.println("Chassis Number:" + twowheeler.chassisNumber);
System.out.println("Punctured:" + twowheeler.isPunctured);
System.out.println("Bike Name:" + twowheeler.bikeName);
System.out.println("Kilometer Run" + twowheeler.runningKM);
	}

}
