package NumberProgrammes;

public class FirstMinLengthOfStringInArray {
	
	public static void main(String[] args) {
		
		
		String a[]= {"varun","kmv","varu","anu","aarun"};
		
		String min=a[0];
		
		for (int i = 0; i < a.length; i++)
		{
			if(min.length() > a[i].length())
			{
				min=a[i];
				
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			if(min.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		
		
	}

}
