public class CountCharacters 
{
	public static void main(String[] args) 
	{	//First Approach:
		/*String s="One Two Three";		
		int characterCount=s.length();
		System.out.println(characterCount);*/
		
		//Second Approach
		String s="One Two Three";
		int arrChar=s.toCharArray().length;
		System.out.println(arrChar);
		
	}
}