/*
 * CHeck if this string is balanced or not
 ({[}] 
 
 */
public class BalancedOrNot {

	public static void main(String args[])
	{
		//String str = "({[}]";
		String str = "({[]]";
		
			while(str.length()>0)
			{
			if(str.contains("("))
			{
				str = str.substring(str.indexOf("(")+1);
				if(!str.contains(")"))
				{
					System.out.println("Not balanced, doesn't have the ')'");

					
				}
			}
			if(str.contains("{"))
			{
				str = str.substring(str.indexOf("{")+1);
				if(!str.contains("}"))
				{
					System.out.println("Not balanced, doesn't have the '}'");
					
				}
			}
			if(str.contains("["))
			{
				str = str.substring(str.indexOf("[")+1);
				if(!str.contains("]"))
				{
					System.out.println("Not balanced, doesn't have the ']'");
					
				}
			}
			
			
			if(str.contains(")"))
			{
				str = str.substring(str.indexOf(")")+1);
			    System.out.println("Not balanced, can't have ')' at start");
					
			
			}
			if(str.contains("}"))
			{
				str = str.substring(str.indexOf("}")+1);
					System.out.println("Not balanced, can't have '}' at start");
					
				}
			}
			if(str.contains("]"))
			{
				str = str.substring(str.indexOf("]")+1);
					System.out.println("Not balanced, can't have ']' at start");
			}
			
			
			
			}
		
	}
	
