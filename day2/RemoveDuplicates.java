package week3.day2;

import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="PayPal India";
		//Convert to Character array
		char[] nameChar=name.toCharArray();
		//set 1 to store characters
		Set<Character> charSet=new HashSet<Character>();
		//set 2 to store Duplicates
		Set<Character> dupCharSet=new HashSet<Character>();
		//check for duplicates and add duplicates to another set
		for(Character charSet1 : nameChar) {
			if(!charSet.add(charSet1)) {
				dupCharSet.add(charSet1);
			}
		}
		System.out.println("Character in the Set: " + charSet);
		System.out.println("Duplicates in the Set: " + dupCharSet);
		//Remove duplicates from first set:charSet
		for (Character duplicate:dupCharSet) {
			if (dupCharSet.contains(duplicate)) {
				charSet.remove(duplicate);
			}
		}
		System.out.println("Set after removing Duplicates: "+ charSet);
		//Removing the Empty Space
		System.out.println("Set after removing Empty Space:");
		for(Character charSet3:charSet) {
			if(charSet3 != ' ') {
				System.out.println(charSet3 + " ");
			}
				}

	}

}
