import java.util.HashMap;
import java.util.Iterator;

public class DuplicateOcurrences {

	//Find and display the number of duplicate ocurrences or each
	//Task 1) Word
	//Task 2) character of a string

			// i = 1 time
			// am = 2 times <-- DISPLAY THIS
			// learning = 1 time
			// java = 2 times <-- DISPLAY THIS
			
			//pseudo-code
			//String [] s = str split(" ") 
			//[I,am,am,learning,java,java]
			//Use hashmap
			
	static void findDuplicateWord(String str) {
		
		HashMap<String, Integer> myMap = new HashMap<>();
		
		String [] s = str.split(" ");
		
		for(String tempString : s) {
			System.out.println(tempString);
			
			if(myMap.containsKey(tempString)) {
				
				myMap.put(tempString, myMap.get(tempString) + 1);
			} else {
				myMap.put(tempString, 1);
			}
		}
		
		System.out.println("my map: " + myMap);
		
		Iterator<String> myIterator = myMap.keySet().iterator();
		
		while(myIterator.hasNext()) {
			String temp = myIterator.next();
			
			if(myMap.get(temp) > 1) {
				System.out.println("Word that is duplicate: " + temp.toUpperCase() + " ... It appared " + myMap.get(temp)+ " number of times");
			}
		}
		
	}
	
	static void findDuplicateCharacters(String str) {
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < str.length(); i++ ) {
			char c = str.charAt(i);
			
			if(hm.get(c) != null) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c,1);
			}
		}
		
		System.out.println("\n my map of characters: " + hm);
		
		Iterator<Character> myIterChars = hm.keySet().iterator();
		
		while(myIterChars.hasNext()) {
				Character cTemp = myIterChars.next();
				
				if(hm.get(cTemp) > 1) {
					System.out.println("Character that is duplicate: " + Character.toUpperCase(cTemp) + " ... It appared " + hm.get(cTemp)+ " number of times");
				}
		}
		
	}
	
	public static void main(String[] args) {
		
		findDuplicateWord("I am am learning java java");
		
		findDuplicateCharacters("javaj2ee3e");

	}

}
