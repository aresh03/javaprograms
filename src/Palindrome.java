
public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s="liril";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}

	}

}
