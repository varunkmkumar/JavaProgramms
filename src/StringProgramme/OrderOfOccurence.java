package StringProgramme;

import java.util.LinkedHashSet;

public class OrderOfOccurence {
	public static void main(String[] args) {
		
		String str="vaaruunn";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			
		System.out.println(str.charAt(i));
		set.add(str.charAt(i));
		System.out.println(set);
		}
		
		
		for (Character ch : set) {
			
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i))
				{
				System.out.println(ch+" = "+(i+1));
				break;
				}
				}
		   
		}
	}

}
