package NumberProgrammes;



public class FirstAndSecondMaxnumWithoutSorting {

	
	public static void main(String[] args) {
		
		
		int a[]= {30,20,10,50,40};
		
		int fMax=0;
		 int sMax=0;
		 
		 for (int i = 0; i < a.length; i++)
		 {
			 if(a[i]>fMax)
			 {
				 sMax=fMax;
				 fMax=a[i];
			 }
			 else if (a[i]>sMax) 
			 {
				
			    sMax=a[i];
				 
			 }
			 
			 	}
	
		 System.out.println(fMax+"        "+sMax);
		
	}
}
