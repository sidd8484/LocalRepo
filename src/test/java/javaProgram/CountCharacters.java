package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {

	public static void main(String[] args) {

		String str = "siddheshwar";
		
		Map<Character,Integer> map = new HashMap<>();
		
		char[] ch = str.toCharArray();
		
		for(char c:ch)
		{
			if(!map.containsKey(c))
			{
				map.put(c, 1);
			}
			else
			{
				int value = map.get(c);
				
				map.put(c, value+1);
			}
		}
		
		System.out.println(map); 
		
		
		
		
	}

}
