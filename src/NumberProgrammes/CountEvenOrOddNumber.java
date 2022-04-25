package NumberProgrammes;

import java.util.Scanner;

public class CountEvenOrOddNumber {
	
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
	     System.out.println("haii");
		int num = sc.nextInt();
		
		int EvenCount=0;
		int OddCount=0;
		
	   while(num>0)
	   {
		   int rem =num%10;
		   if(rem%2==0)
		   {
			   EvenCount++;
			   
		   }
		   else {
			   OddCount++;
		   }
		   
		   
		   num=num/10;
		   
	   }
		System.out.println(EvenCount);
		
		System.out.println(OddCount);
	
	}

}
