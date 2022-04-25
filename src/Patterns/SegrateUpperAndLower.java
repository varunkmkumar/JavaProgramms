package Patterns;

public class SegrateUpperAndLower {
public static void main(String[] args) {
	String s="VaRuNKm";
	//Expected op-->VRNK  aum
	    /*char[] ss = s.toCharArray();
	
	    for (int i = 0; i < ss.length; i++) {
	    	
	    	if(ss[i]>='A' && ss[i]<='Z')
	    	{
	    		System.out.print(ss[i]);
	    	}
	    	else {
	    		System.out.print(ss[i]);
	    	}
			
		}*/
	
	
	String cap="";
	String sma="";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			cap=cap+s.charAt(i);
		}
		else {
			sma=sma+s.charAt(i);
		}
		
	}
	
	  System.out.println(cap+"  "+sma );  
}
}
