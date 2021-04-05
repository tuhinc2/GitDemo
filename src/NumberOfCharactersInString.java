import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberOfCharactersInString {
	public static void main(String args[])
	{
		String obj = "Tuhin Chakraborty";
		char arr[] = obj.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character c : arr)
		{
			if(map.get(c)!=null)
			{
				map.put(c, map.get(c)+1);
			}
			else {
			map.put(c, 1);
			}
		}
		
		
		Set<Character> set = map.keySet();
		for(Character ch : set)
		{
			System.out.println("'"+ch+"' occurs "+map.get(ch)+" times.");
		}
		
	}
}
