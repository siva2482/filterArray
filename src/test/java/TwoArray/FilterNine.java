package TwoArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class FilterNine {
	
	public static List<Integer> nonine(int[] num)
	{
		List<Integer> list=new ArrayList<Integer>();
		list=findnine(num);
		return list;
	}
	public static List<Integer> findnine(int[] x)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<x.length;i++)
		{
			if(!(x[i]%10==9))
			{
				list.add(x[i]);
			}
		}
		return list;
	}
	
	
	@Test
	public void testrun1()
	{
		int[] num= {9,19,3,29};
		//int[] num1 {3};
		List<Integer> actuallist=nonine(num);
		List<Integer> expectedlist=new ArrayList<Integer>();
		expectedlist.add(3);
		Assert.assertEquals(actuallist, expectedlist);
	}
	
	@Test
	public void testrun2()
	{
		int[] num1= {1,2,9};
		//int[] num1 {3};
		List<Integer> actuallist=nonine(num1);
		List<Integer> expectedlist=new ArrayList<Integer>();
		expectedlist.add(1);
		expectedlist.add(2);
		Assert.assertEquals(actuallist, expectedlist);
	}


}
