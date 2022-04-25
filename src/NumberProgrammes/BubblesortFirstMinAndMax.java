package NumberProgrammes;

public class BubblesortFirstMinAndMax {
	
	public static void main(String[] args) {
		
	int a[]= {30,22,25,15,13};
		
		//for iteration
		for(int i=0;i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length; j++)//for swapping the number
			{
				
				if(a[i]>a[j])//it is for ascending..for descending just change > to <
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
			
		}
		
		
	//	System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
	}

}
