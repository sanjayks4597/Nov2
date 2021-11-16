package common_questions;

public class SmallestMissingElement {

	public static void main(String[] args) {
		
		int []x= {1,2,4,5,7,8,9};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i]!=x[i+1]-1)
			{
				if((x[i]+1)<min)
				{
					min=x[i]+1;
				}
			}
			
		}
		System.out.println("Smallest missing element is :"+min);

	}

}
