package NumberProgrammes;

public class SumOfTwoArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		int b[]= {5,15,25};
		
		int count=a.length;
		if(a.length<b.length)
		{
			count=b.length;
		}
		
		
		for(int i=0;i<count; i++)
		{
			
			try {
		System.out.println(a[i]+b[i]);
			}
			catch(Exception e){
				if(a.length>b.length)
				{
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
		}
		
		
	}
	
}
