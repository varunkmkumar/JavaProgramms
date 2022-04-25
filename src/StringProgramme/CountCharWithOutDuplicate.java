package StringProgramme;

import java.util.LinkedHashSet;

public class CountCharWithOutDuplicate {
public static void main(String[] args) {
	
	String str ="vaaruunn";
	          
	LinkedHashSet<Character> set =new LinkedHashSet<>();
	
	for(int i=0; i<str.length();i++)
	{
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
		if(count==1)
		{
			System.out.println(ch+"="+count);
		}
			
	}
	
	
}
	
	
}
