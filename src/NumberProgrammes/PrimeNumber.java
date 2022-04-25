package NumberProgrammes;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
				System.out.println("haii");
				int num = sc.nextInt();
				 boolean flag=true;
				 
				 if(num<=1)
				 {
					 flag=false;
				 }
				 
				 for(int i=2; i<num; i++)
				 {
					 if(num%i==0)
					 {
						 flag=false;
						 break;
					 }
				 }
				
				if(flag==true)
				{
					System.out.println("its is prime number");
					
				}
				else
				{
					System.out.println("its not a prime number");
				}
				 
		
	}

}        
