
public class ReverseStringWord 
{

	public static void main(String[] args) 
	{
		String s="One Two Three";
		
		String[] arr=s.split(" ");
		
		String rev="";
		
		String s1="";
		
		for(int i=0; i<=arr.length-1; i++)
		{
			s1=s1+arr[i];
			
			for(int j=s1.length()-1; j>=0; j--)
			{
				rev=rev+s1.charAt(j);
			}
			
			s1="";
		}
		
		System.out.println(rev);

	}

}
