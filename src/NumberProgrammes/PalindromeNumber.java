package NumberProgrammes;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("haii");
		int num = sc.nextInt();
		
		int Originalnum=num;
		
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
			
		}
		
		if(Originalnum==rev)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("iy is not apalindrome number");
		}
		
	}

}
