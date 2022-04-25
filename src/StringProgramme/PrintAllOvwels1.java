package StringProgramme;

import java.util.LinkedHashSet;

public class PrintAllOvwels1 {
	
public static void main(String[] args) {
	
	
	
	String str= "varunkumar";
	System.out.println(str);
	int count=0;
	char[] ch = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {

		if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u')
		{
			count++;
			System.out.print(ch[i]);
		}
			
	}
	
	System.out.println("="+count);
}

}
  