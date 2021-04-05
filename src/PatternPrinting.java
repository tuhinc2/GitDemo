/*
 * 
 * Print this pattern
1 2 3 4

2 3 4 1

3 4 1 2

4 1 2 3 
 * 
 * 
 */

public class PatternPrinting {

	public static void main(String args[])
	{
		
		for(int i=0;i<4;i++)
		{
		   for(int j=i+1;j<=4;j++)
		   {
			   System.out.print(j+" ");
		   }
		   
		   for(int k=1;k<=i;k++)
		   {
			   System.out.print(k+" ");
		   }
		   System.out.println(); 
		}		
	}
	
	
}
