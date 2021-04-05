import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String args[])
	{
		String obj = " Hi, I am Tuhin and I am a programmer.I am also a player ";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String strArr[] = obj.trim().split("\\W");
		for(int i=0;i<strArr.length;i++)
		{
			if(map.get(strArr[i])!=null)
			{
				map.put(strArr[i], map.get(strArr[i])+1);
			}
			else {
				
				map.put(strArr[i], 1);
				
			}
		}
		
		Set<String> setString = map.keySet();
		for(String s : setString)
		{
			if(map.get(s)>1)
			{
				System.out.println("'"+s+"' = No. of Occurance: "+map.get(s));
				
			}
		}
		
	}
}
