package NumberProgrammes;

public class FirstMaxLengthOfStringInArray {
	
	public static void main(String[] args) {
		
		
		String a[]= {"varun","km","varu","anu","aarun"};
		
		String max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(  a[i].length()>max.length())
			{
				max=a[i];
			}
			
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if(max.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
			
		}
		
	}

}
