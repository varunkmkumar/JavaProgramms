package NumberProgrammes;

public class SwapNumber {
	
	public  static void  main(String[] args)
	{
		int a=10;
		int b=20;
		
		System.out.println("before swapping");
		
		//logic 1
	/*	int temp=a;
		a=b;
		b=temp;*/
		
		
		
		//logic 2
		a=a+b;
		b=a-b;
		a=a-b;
		
		//logic 3
	/*	a=a*b;
		b=a/b;
		a=a/b;*/
		
		
		//logic 4
		//b=a+b-(a=b);
		
		
		
		System.out.println("after swapping     "+a+"   "+b);
		
		
	}

}
