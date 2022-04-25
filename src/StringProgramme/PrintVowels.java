package StringProgramme;

import java.util.LinkedHashSet;

public class PrintVowels {

	
	public static void main(String[] args) {
		
		String str= "VArunkumAr";
		str=str.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<str.length(); i++)
		{
			set.add(str.charAt(i));
			//System.out.println(set);
		}
		
		int count=0;
		for (Character ch : set) {
			
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				count++;
				System.out.print(ch);
			}
			
			}
		
		
		System.out.println("="+count);
	}
	
	
}
