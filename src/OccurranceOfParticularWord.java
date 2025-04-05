
public class OccurranceOfParticularWord 
{

	public static void main(String[] args) 
	{
		String s="One Two Three One";
		
		String[] arr=s.split(" ");
		
		int count=0;
		
		int beforeWordRemoval=arr.length;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i].equals("One"))
			{
				count=count+1;
			}
		}
		
		
		int countOccurranceOfWord=beforeWordRemoval-count;
		
		System.out.println(countOccurranceOfWord);
		
		

	}

}
