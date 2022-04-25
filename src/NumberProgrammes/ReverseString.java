package NumberProgrammes;

import java.util.Scanner;

public class ReverseString {

	
	public static void main(String[] args) {
		
		Scanner se=new Scanner(System.in);
		System.out.println("haii");
		String str=se.next();
		
	//String rev="";
	
	//logic 1:using concatination operator
/*	for(int i=str.length()-1; i>=0; i--)
		{
			rev =rev+str.charAt(i);
		}
		
		
		
		//logic 2:using char arry
	/*char a[]=str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev =rev+str.charAt(i);
		}*/
		
	
	
	//logic 3:using Stringbuffer class
	
	/*StringBuffer sb=new StringBuffer(str);
	          StringBuffer s = sb.reverse();
		
		System.out.println(s);   */
		
		
		//reverse a string with out using length()
		               char[] s = str.toCharArray();
		               int count=0;
		               for(char c:s)
		               {
		            	   count++;
		               }
		
		
		               for(int i=count-1; i>=0; i--)
		               {
		            	   System.out.print(str.charAt(i));
		               }
		
		
		
		
		
	}
}
