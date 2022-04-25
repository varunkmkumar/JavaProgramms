package NumberProgrammes;

public class FirstMaxNumWithOutSorting {

	public static void main(String[] args) {
		
		int a[]= {30,10,20,50,40};
		
		int max=a[0];
		for(int i=1; i<a.length; i++)
		{
			
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		
		System.out.println(max);
		
	}
	
	
}
