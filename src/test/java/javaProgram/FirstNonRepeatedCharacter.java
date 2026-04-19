package javaProgram;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {

		String str = "aabbcde";     //Store the string
		
		for(char c:str.toCharArray())   //Convert string into char array   c:'a'
			                                                            
		{
			if(str.indexOf(c)==str.lastIndexOf(c))                   //str.indexOf('a') - index 0 (found), then str.lastIndex('a') - index 1 (found)
				                                                     //  str.index('a')==str.lastIndexOf('a')   0==1 (condition false)
			{
				System.out.println(c);
				break;
			}
		}
	}

}

    
    