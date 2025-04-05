import java.util.HashMap;

public class OccuranceOfEachWord 
{

	public static void main(String[] args) 
	{
		String s="One Two Three One Two Three";
		
		String[] arrWords=s.split(" ");
		
		HashMap<Object, Integer> countWordOccurrance=new HashMap<Object, Integer>();
		
		for(int i=0; i<=arrWords.length-1; i++)
		{
			String key=arrWords[i];
			
			if(countWordOccurrance.containsKey(key))
			{
				int count=countWordOccurrance.get(key);
				
				countWordOccurrance.put(key, count+1);
			}
			else
			{
				countWordOccurrance.put(key, 1);
			}
		}
		
		System.out.println(countWordOccurrance);
	}

}
