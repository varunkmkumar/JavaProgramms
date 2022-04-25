package StringProgramme;

import java.util.LinkedHashSet;

public class CountTheCharacterClass {

	
	public static void main(String[] args) {
		
		String str="Vaaruunn";
		str=str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			
		System.out.println(str.charAt(i));
		set.add(str.charAt(i));
		System.out.println(set);
		}
		
		
		for (Character ch : set) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if(ch==str.charAt(i))
				{
					count++;
				}
				}
			System.out.println(ch+"="+count);
		}
		
	}
	
}
