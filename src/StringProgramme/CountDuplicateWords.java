package StringProgramme;

import java.util.LinkedHashSet;

public class CountDuplicateWords {
	public static void main(String[] args) {
		
		String[] str="welcome to to testyantra".split(" ");
		  
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
			        System.out.println(word2+" "+count);
			}
		    
		
	}

}
