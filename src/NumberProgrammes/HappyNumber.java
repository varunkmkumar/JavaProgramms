package NumberProgrammes;

public class HappyNumber {
	public static void main(String[] args) {
		
		int num=456;
		
		
	while(num>9)	
	{
		
		int sum=0;
		while(num>0)
		{
			int rem= num%10;
			sum=sum+rem;
			num=num/10;
		}
		
	num=sum;
	}
	System.out.println(num);
	}

}
