
public class NumberPalindrome {

	public static void main(String args[])
	{
		int num = 121;
		int num1 = num;
		int num2 = num;
		System.out.println("Original Number = "+num);
		int countOfDigits = 0;
		while(num1>0)
		{
			num1 = num1/10;
			countOfDigits++;
		}
		int rem = 0;
		int revNum = 0;
		int i = 1;
		while(num>0)
		{
			rem = num%10;
			revNum = revNum + (rem * (int) Math.pow(10, countOfDigits-i));
			num = num /10;	
			i++;
		}
		
		System.out.println("Reverse Number = "+revNum);
		if(revNum == num2)
		{
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome!");
		}
		
	}
}
