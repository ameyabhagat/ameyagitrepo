import java.util.Hashtable;


public class CC0104 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="bca";
		if (s1.length()!=s2.length()) System.out.print(false);
		int count;
		Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
		for(int i=0;i<s1.length();i++){
			if(h.containsKey(s1.charAt(i))){
				count=h.get(s1.charAt(i));
				h.put(s1.charAt(i), ++count);
			}
			else h.put(s1.charAt(i), 1);
			
		}
		for(int j=0;j<s2.length();j++){
			if(h.containsKey(s2.charAt(j))){
				count=h.get(s2.charAt(j));
				h.put(s2.charAt(j), --count);
				if (count==0) h.remove(s2.charAt(j));
			}
			else System.out.print(false);
			
		}
		
		if (h.isEmpty()) System.out.print(true);
	}

}
