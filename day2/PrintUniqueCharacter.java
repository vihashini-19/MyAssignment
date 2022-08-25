package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input Your Name
		String name= "Adithi";
		//Convert to Character array
		char[] nameChar=name.toCharArray();
		//Create Hash set
		Set<Character> setChar=new HashSet<Character>();
		//printing Unique Character
		for (Character uniqChar : nameChar) {
			//if the Character repeats remove
			if(!setChar.add(uniqChar)) {
				setChar.remove(uniqChar);
			}
		}
		System.out.println(setChar);

	}

}
