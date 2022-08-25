package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		//Set 1 to store input
		Set<Integer> intset=new HashSet<Integer>();
		
		//Set 2 to Store duplicates
		Set<Integer> duplicateSet =new HashSet<Integer>();
		//Check for duplicates
		for(int numbers:data) {
			if(!intset.add(numbers)) {
				duplicateSet.add(numbers);
			}
		}
		System.out.println("Numbers in The Set: " + intset);
		System.out.println("Duplicates in The Set " + duplicateSet);

	}

}
