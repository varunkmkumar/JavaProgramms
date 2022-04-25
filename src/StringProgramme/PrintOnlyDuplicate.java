package StringProgramme;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicate {
public static void main(String[] args) {
		
		String s="welcome to to testyantra";
		    String[] str = s.split(" ");
		    LinkedHashSet<String> set =new LinkedHashSet<>();
		    for(String word:str)
		    {
		    	System.out.println(word);
		    	set.add(word);
		    	System.out.println(set);
		    	
		    }
		    
		    
		    for (String word2 : set)
		    {
			int count=0;
			        for (String word3 : str) 
			        {
						if(word3.equals(word2))
						{
							count++;
							
						}
					}
			         if(count>1)
			         {
			        	  System.out.println(word2+" "+count);
			         }
			}
		    
		
	}

}
