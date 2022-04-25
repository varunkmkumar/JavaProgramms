package NumberProgrammes;

public class FirstMinNumWithOutSorting {
	
	public static void main(String[] args) {
		
		
		int a[]= {30,10,20,50,40};
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
			
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		
		System.out.println(min);
		
	}

}
