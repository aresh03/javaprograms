import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateCharacter 
{

	public static void main(String[] args) 
	{
		String s="One Two Three".toLowerCase();
		
		String s1="";
		
		HashMap<Character, Integer> charArray=new HashMap<Character, Integer>();
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			
			if(charArray.containsKey(ch))
			{
				charArray.put(ch, charArray.get(ch)+1);			
			}
			else
			{
				charArray.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet=charArray.entrySet();
		
		for(Entry<Character, Integer> entry:entrySet)
		{
			if(entry.getValue()==1)
			{
				s1=s1+entry.getKey();
			}
		}
		
		System.out.println(s1);

	}

}
