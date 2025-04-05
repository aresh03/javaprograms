
public class CountVowelsConsonants 
{

	public static void main(String[] args) 
	{
		String s="One Two Three".toLowerCase();
		
		int countVowels=0;
		
		int countConsonants=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				countVowels=countVowels+1;
			}
			else
			{
				countConsonants=countConsonants+1;
			}
		}
		
		System.out.println("Total Vowels: "+countVowels);
		
		System.out.println("Total Consonants: "+countConsonants);
	}

}
