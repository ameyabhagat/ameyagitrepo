package removeduplicatesfromstring;
import java.util.LinkedHashSet;
import java.util.Set;


public class RemoveDups {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aabbccdefatafaz";

	    char[] chars = string.toCharArray();
	    Set<Character> charSet = new LinkedHashSet<Character>();
	    for (char c : chars) {
	        charSet.add(c);
	    }

	    StringBuilder sb = new StringBuilder();
	    for (Character character : charSet) {
	        sb.append(character);
	    }
	    System.out.println(sb.toString());
	}

}

/*
1. Null
2. Empty string
3. String having all caharacters same. Say: "aaaaa aaaaa"
4. String with huge length: What is the upper limit on string length??
5. String with duplicate characters at alternate locations. Say: “abab cdcd ecec”
*/