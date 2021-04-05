import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String args[])
	{
		String obj = "He is a very very hard working person!";
		String arr[] = obj.split("\\s");
		Set<String> setString = new LinkedHashSet<String>();
		for(int i = 0;i<arr.length;i++)
		{
			setString.add(arr[i]);			
		}
		Iterator<String> itr = setString.iterator();
		while(itr.hasNext())
		{

			System.out.print(itr.next()+" ");
		}
	}
}