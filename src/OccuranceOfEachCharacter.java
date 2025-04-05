import java.util.HashMap;

public class OccuranceOfEachCharacter 
{

	public static void main(String[] args) 
	{
		String s="One Two Three".toLowerCase();
		
		HashMap<Character, Integer> characterCount=new HashMap<Character, Integer>();
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char key=s.charAt(i);
			
			if(characterCount.containsKey(key))
			{
				int count=characterCount.get(key);
				
				characterCount.put(key, count+1);
			}
			else
			{
				characterCount.put(key, 1);
			}
		}
		
		System.out.println(characterCount);

	}

}
