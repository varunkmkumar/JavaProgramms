package NumberProgrammes;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("haii");
		int num = sc.nextInt();
		
		int fact=1;
		
 		for (int i = num; i >0; i--)
		{
			fact=fact*i;
		}
		
		
		System.out.println(fact);
	}

}