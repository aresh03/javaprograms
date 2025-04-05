import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicateWord 
{

	public static void main(String[] args) 
	{
		String s="One Two Three One".toLowerCase();
		
		String s1="";
		
		String[] arrString=s.split(" ");
		
		HashMap<String, Integer> stringMap=new HashMap<String, Integer>();
		
		for(int i=0; i<=arrString.length-1; i++)
		{
			String sh=arrString[i];
			
			if(stringMap.containsKey(sh))
			{
				stringMap.put(sh, stringMap.get(sh)+1);
			}
			else
			{
				stringMap.put(sh, 1);
			}
		}
		
		Set<Entry<String, Integer>> entrySet=stringMap.entrySet();
		
		for(Entry<String, Integer> entry:entrySet)
		{
			if(entry.getValue()==1)
			{
				s1=s1+entry.getKey()+" ";
			}
		}
		
		System.out.println(s1);

	}

}
