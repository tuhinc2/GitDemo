/*
 * 
 * Find out the occurrence of each character in the string
 */


import java.util.Iterator;
import java.util.LinkedHashSet;

public class SampleApp {

	public static void main(String args[])
	{
		
		
		String str = "Tuhin Chakraborty";
		char ch;
		int count = 0;
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length();i++)			
		{
			ch = str.charAt(i); 
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j) == ch)
				{
					count++;
				}
			}
			set.add(ch+" occurs "+count+" times");
			count = 0;
		}
		Iterator itr = set.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
	}
	
}
