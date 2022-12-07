package TwoArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FiltetArray {
	
	
	public static int[] filterTwo(int[] ar1,int[] ar2)
	{
		//
		int[] result=new int[2];
		List<Integer> list=new ArrayList<Integer>();
		if(ar1.length>=2)
		{
			System.arraycopy(ar1, 0, result, 0, 2);
			
		}
		else if(ar1.length<2)
		{
			System.arraycopy(ar1, 0, result, 0, ar1.length);
			int x=result.length-ar1.length;
			/*System.out.println(n);
			for(int i=0;i<result.length;i++)
				System.out.println(result[i]);
		
			int x=ar1.length-n;*/
			System.arraycopy(ar2, 0, result, ar1.length,x );
			
		}
		//for(int i=0;i<result.length;i++)
		System.out.print(Arrays.toString(result));
		return result;
		
		
	}
	
	@Test
	public void testing1()
	{
		int[] ar1= {4,2};
		int[] ar2= {1,2,3};
		int[] expected= {4,2};
		int[] actual=filterTwo(ar1,ar2);
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	
	}
	@Test
	public void testing2()
	{
		int[] ar1= {4};
		int[] ar2= {1,2,3};
		int[] expected= {4,1};
		int[] actual=filterTwo(ar1,ar2);
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	public void testing3()
	{
		int[] ar1= {};
		int[] ar2= {1,2,3};
		int[] expected= {1,2};
		int[] actual=filterTwo(ar1,ar2);
		Assert.assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}



}
