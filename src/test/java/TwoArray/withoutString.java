package TwoArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class withoutString {
	
	public static List<String> without(String[] str,int n)
	{
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).length()==n)
			{
				list.remove(list.get(i));
			}
		}
		System.out.println(list);
		return list;
		
	}
	
	
	@Test
	public void testrun1()
	{
		String[] str= {"a","bb","b","ccc"};
		int n=1;
		String[] s1= {"bb","ccc"};
		List<String> expectedlist=new ArrayList<String>(Arrays.asList(s1));
		List<String> actuallist=without(str,n);
		Assert.assertEquals(expectedlist, actuallist);
		
		
	}
	@Test
	public void testrun2()
	{
		String[] str= {"a","bb","b","ccc"};
		int n=3;
		String[] s1= {"a","bb","b"};
		List<String> expectedlist=new ArrayList<String>(Arrays.asList(s1));
		List<String> actuallist=without(str,n);
		Assert.assertEquals(expectedlist, actuallist);
		
		
	}

	@Test
	public void run()
	{
		String[] str1= {"a","bb","b","ccc"};
		int n=4;
		String[] s1= {"a","bb","b","ccc"};
		List<String> expectedlist=new ArrayList<String>(Arrays.asList(s1));
		List<String> actuallist=without(str1,n);
		Assert.assertEquals(expectedlist, actuallist);
		
		
	}
	@Test
	public void brun()
	{
		String[] str2= {"cccccccccccccccccccc"};
		int n=20;
		String[] s1= {""};
		List<String> expectedlist=new ArrayList<String>(Arrays.asList(s1));
		List<String> actuallist=without(str2,n);
		Assert.assertEquals(expectedlist, actuallist);
		
		
	}
}
