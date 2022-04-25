package NumberProgrammes;

public class AddNumInWord {
	public static void main(String[] args) {
		
		String str="ad12vt34vg56";
		int sum=0;
		int tsum=0;
		
		for(int i=0;i<str.length(); i++)
		{
			
			if(str.charAt(i)>='1' && str.charAt(i)<='9')
			{
				sum=sum*10+(str.charAt(i)-48);
				
			}
			else {
				tsum=tsum+sum;
				sum=0;
			}
			
		}
	
		System.out.println(tsum+sum);
	}

}
