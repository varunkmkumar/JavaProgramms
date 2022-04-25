package StringProgramme;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		
		String str="welcome to bangalore";
		String[] s = str.split(" ");
		
		for (int i=s.length-1; i>=0; i--)
		{
			
			System.out.print(s[i]+" ");
			
		}
		
		for (int i=s.length-1; i>=0; i--)
		{
			System.out.print(s[i]);
			
		}
		
		
		
		for(int i=0;i<s.length; i++)
		{
			System.out.print(s[i]);
		}
		
	}

}
