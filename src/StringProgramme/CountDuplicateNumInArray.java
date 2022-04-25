package StringProgramme;

import java.util.LinkedHashSet;

public class CountDuplicateNumInArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,30,10,20,30,40};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			set.add(a[i]);
			System.err.println(set);
		}
		
		for(Integer in: set)
		{
			    int count=0;
			    for(int i=0; i<a.length; i++)
			    {
			    	if(in==a[i])
			    	{
			    		count++;
			    	}
			    }
			    System.out.println(in+" "+count);
		}
		
		
		
	}
}
