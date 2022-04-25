package StringProgramme;

public class SwapWordInString {
	public static void main(String[] args) {
		
		String str="welcome to bangalore";
		String[] s = str.split(" ");
		String temp=s[0];
		s[0]=s[2];
		s[2]=temp;
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
			 
		}
		
	}

}
 