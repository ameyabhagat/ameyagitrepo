import java.util.ArrayList;


public class StrPermute {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> permutations = new ArrayList<String>();
		permutations= permuteStr("bc");
			for(String perm:permutations){
				System.out.println(perm);
			}
	}
	public static ArrayList<String> permuteStr(String str){
		
		if(str==null) return null;
		
		ArrayList<String> permutations = new ArrayList<String>();
		if(str.length()==0){
			permutations.add("");
			return permutations;
		}
		char c = str.charAt(0);
		String rem=str.substring(1);
		ArrayList<String> words=permuteStr(rem);
		for(String word : words)
			for(int j=0;j<=word.length();j++){
				String s = insert(word,c,j);
				permutations.add(s);
			}
		
		return permutations;
	}

	public static String insert(String s,char c, int j){
		String start=s.substring(0,j);
		String end=s.substring(j);
		return start+c+end;
	}

}
