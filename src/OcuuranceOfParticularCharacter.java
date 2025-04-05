
public class OcuuranceOfParticularCharacter 
{

	public static void main(String[] args) 
	{
		String s="One Two Three".toLowerCase();
		
		int characterCount=0;
		
		int totalLength=s.length();
		
		int totalLengthAfterCharacterRemoval=s.replace("t","").length();
		
		characterCount=totalLength-totalLengthAfterCharacterRemoval;
		
		System.out.println(characterCount);
	}

}
