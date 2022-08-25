package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//Create Treeset and add into set
		Set<Integer> secondLarge = new TreeSet<Integer>();
		for(int i=0; i<data.length; i++) {
			secondLarge.add(data[i]);
		}
		System.out.println("TreeSet: "+ secondLarge);
		
		//Convert set into List and Find second largest
		List<Integer> setInToList=new ArrayList<Integer>(secondLarge);
		System.out.println("List: "+ setInToList);
		int count=setInToList.size();
		int secondLargestNumber=setInToList.get(count-2);
		System.out.println("The Second Largest Number in List: "+ secondLargestNumber);
	}

}
