import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String s="One Two Three".toLowerCase();
		
		HashMap<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		if(s.isEmpty())
		{
			System.out.println("String is Empty");
		}
		
		if(s.equals(null))
		{
			System.out.println("String is null");
		}
		
		if(s.length()==1)
		{
			System.out.println("String contains only single character");
		}
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
			{
				charMap.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet=charMap.entrySet();
		
		for(Entry<Character, Integer> entry:entrySet)
		{
			if(entry.getValue()>1 && entry.getKey()!=' ')
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}

	}

}
