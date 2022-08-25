package week3.day2;

import java.util.Set;
import java.util.TreeSet;
public class MissingNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input Rondom numbers from 1 to 10
		int[] data = {11,3,2,1,4,12,6,5,9,8,10};
		//Add into set
		Set<Integer> missingNumber = new TreeSet<Integer>();
		for (int i=0; i < data.length; i++) {
			missingNumber.add(data[i]);
		}
			System.out.println("Numbers in Set: " + missingNumber);
			//Check for Missing Number
		for (int i = 0; i <=missingNumber.size(); i++) {
			if(!missingNumber.contains(i + 1)) {
				System.out.println("The Missing Number: " + (i + 1));
			}
				
		}

	}

}
