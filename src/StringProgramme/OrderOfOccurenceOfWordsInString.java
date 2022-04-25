package StringProgramme;

import java.util.LinkedHashSet;

public class OrderOfOccurenceOfWordsInString {
	public static void main(String[] args) {
		
		

		String str="welcome to to bangalore";
		String[] stra = str.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<>();
		
		for (int i = 0; i < stra.length; i++)
		{
		set.add(stra[i]);	
		}
		
		for(String ch: set)
		{
			for(int i=0;i<stra.length;i++)
			{
				if(ch==stra[i])
				{
					System.out.println(ch+" "+(i+1));
					break;
				}
			}
			
			
		}
		 
	}
	
	
	

}
