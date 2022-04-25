package Patterns;

public class Challenge {
public static void main(String[] args) {
	String s="My Name Is Varun";
	//Expected output-->My0Name0Is0Varun
	
	String st="";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)==' ')
		{
			st=st+'0';
		}
		else
		{
			st=st+s.charAt(i);
		}
		
		
	}
	System.out.println(st);
	
}
}
