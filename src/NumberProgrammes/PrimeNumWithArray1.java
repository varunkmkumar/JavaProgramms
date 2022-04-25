package NumberProgrammes;

public class PrimeNumWithArray1 {
	public static void main(String[] args) {
		
		int a[]= {3,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			 int num=a[i];
			 boolean flag=true;
			 for(int j=2;j<num; j++)
			 {
				 if(num%j==0)
				 {
					 flag=false;
					 break;
				 }
			 }
			 
			 if(flag==true)
			 {
				 System.out.println(a[i]+" ");
			 }
		}
		
		
		
		
		
		
		
	
	}
}
