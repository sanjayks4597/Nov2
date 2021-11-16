package common_questions;

public class FindMissingElementInLogTime {

	public static void main(String[] args) {
		int []x= {1,2,3,4,5,7,8,9};
		int index=0;
		int missing=FindMissing(x,index);
		System.out.println(missing);

	}

	private static int FindMissing(int[] x, int idx) {
		if(idx==x.length-1)
		{
			return 0;
		}
		if(x[idx]!=x[idx+1]-1)
		{
			return x[idx]+1;
		}
		else
			return FindMissing(x, idx+1);
		
	}

}
