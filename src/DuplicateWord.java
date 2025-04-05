import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWord 
{

	public static void main(String[] args) 
	{
		String s="One Two Three One".toLowerCase();
		
		String[] arrString=s.split(" ");
		
		HashMap<String, Integer> duplicateWord=new HashMap<String, Integer>();
		
		for(int i=0; i<=arrString.length-1; i++)
		{
			String str=arrString[i];
			
			if(duplicateWord.containsKey(str))
			{
				duplicateWord.put(str, duplicateWord.get(str)+1);
			}
			else
			{
				duplicateWord.put(str, 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet=duplicateWord.entrySet();
		
		for(Entry<String, Integer> entry:entrySet)
		{
			if(entry.getValue()>1 && entry.getKey()!=" ")
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}

	}

}
