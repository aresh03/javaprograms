
public class CountUppercaseLowercaseDigitSpacesSpecialCharacter 
{

	public static void main(String[] args) 
	{
		String s=" One$Two12#Three ";
		
		int countUppercase=0;
		
		int countLowercase=0;
		
		int countDigit=0;
		
		int countSpace=0;
		
		int countSpecialCharacter=0;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			char c=s.charAt(i);
			
			if(Character.isUpperCase(c))
			{
				countUppercase=countUppercase+1;
			}
			else if(Character.isLowerCase(c))
			{
				countLowercase=countLowercase+1;
			}
			else if(Character.isDigit(c))
			{
				countDigit=countDigit+1;
			}
			else if(Character.isWhitespace(c))
			{
				countSpace=countSpace+1;
			}
			
			else
			{
				countSpecialCharacter=countSpecialCharacter+1;
			}
		}
		
		System.out.println("Total Uppercase Character: "+countUppercase);
		
		System.out.println("Total Lowercase Character: "+countLowercase);
		
		System.out.println("Total Digits: "+countDigit);
		
		System.out.println("Total Space: "+countSpace);
		
		System.out.println("Total Special Characters: "+countSpecialCharacter);

	}

}
