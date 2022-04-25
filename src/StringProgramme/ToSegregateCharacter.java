package StringProgramme;

public class ToSegregateCharacter {
	
	public static void main(String[] args) {
		
		
		String str="var3*as*32#$";
		String alph=" ";
		String no=" ";
		String spec=" ";
		
		for(int i=0;i<str.length(); i++)
		{
			
		if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z')
			//if(Character.isAlphabetic(str.charAt(i))
			{
				alph=alph+str.charAt(i);
			}
			
			else if(str.charAt(i)>='0' && str.charAt(i)<'9')//else if(Character.isDigit(str.charAt(i)));
			{
				no=no+str.charAt(i);
			}
			
			else {
				spec=spec+str.charAt(i);
				
			}
		}
	
		System.out.println(alph+no+spec);
		
	}
	
	
	

}
