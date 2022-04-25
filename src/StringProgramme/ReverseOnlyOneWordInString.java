package StringProgramme;

import java.util.LinkedHashSet;

public class ReverseOnlyOneWordInString {

public static void main(String[] args) {
	
	String str= "welcome to bangalore";
	String[] s = str.split(" ");
	
	LinkedHashSet< String> set=new LinkedHashSet<>();
	
	for(String st:s)
	{
		set.add(st);
		System.out.println();
	}
	
	
	
	
}
}
