package NumberProgrammes;

import java.util.Scanner;

public class PlindromeString {
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("haiii");
		       String str = sc.next();
		       String rev=""; 
		       
		       
	/*	  String OriginalString=str;
		  
		  
		  for(int i=str.length()-1; i>=0; i--)
		  {
			  rev=rev+str.charAt(i);
			  
		  }
		  
		       
		if(OriginalString==rev)
		{
			System.out.println("it is apalindrome string    "+rev);
		}
		else {
			System.out.println("it is not apalindrome string   "+rev);	
		}*/
		
		       
		       for (int i = 0; i < str.length(); i++)
		       {
		    	   rev=rev+str.charAt(i);
			    }
		       
		       if(str.equals(rev)) {
		    	   System.out.println("it is apalindrome string    "+rev);
		       }
		       else {
		    	   System.out.println("it is not apalindrome string   "+rev);	
				}	
		       
		
				 
		       
		       
	}

}
