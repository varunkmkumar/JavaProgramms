package Patterns;

public class DecreasingPyaramid {
public static void main(String[] args) {
	
	int no=5;
	for (int i = 1; i <= no; i++) {
		
		for (int j = i; j <= no; j++) {
			System.out.print("* ");
			
		}
		System.out.println( );
	}
}
}
