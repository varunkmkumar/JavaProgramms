package NumberProgrammes;

public class FibonaousSeries1 {
	public static void main(String[] args) {
		
		int fib1=0;
		int fib2=1;
		int fib3=0;
		System.out.print(fib1+" "+fib2);
		for(int i=0; i<50; i++)
		{
			
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			if(fib3<50) {
				System.out.print(fib3+" ");
			}
			else {
				break;
			}
			
			
		}
	}

}
