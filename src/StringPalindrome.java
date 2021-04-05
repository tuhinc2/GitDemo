
public class StringPalindrome {

	public static void main(String args[])
	{
		String obj = "Liril";
		StringBuilder br = new StringBuilder(obj);
		System.out.println(br.reverse());
		String afterReverse = br.toString();
		if(obj.equalsIgnoreCase(afterReverse))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome!");
		}		
	}
}
