package NumberProgrammes;

public class BubblesortFirst3MinAndmaxSum {

	
	public static void main(String[] args) {
		int a[]= {30,22,25,15,13};
		
		for(int i=0;i<a.length; i++)
		{
			
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])//this is first 3 min num sum ...........if we want first 3 max num sum then change > to <
				{
					int temp= a[i];
					a[i]=a[j];
					a[j] =temp;
				}
			}
			
		}
		
		
		int sum=0;
		for(int i=0; i<3; i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		
	}
}
