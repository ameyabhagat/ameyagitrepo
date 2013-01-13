import java.util.Hashtable;


public class CC0101 {

	/**Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		boolean resulta,resultb;
		String str="abcdefa";
		resulta=withAds(str);
		resultb=withoAds(str);
		System.out.println(resulta + "," + resultb);
		
	}
	
	public static boolean withAds(String str){
		
		boolean[] arr = new boolean[256];
		//String str="abcdef";
		//
		for (int i=0;i<str.length();i++)
		{
			int val=str.charAt(i);
			if (arr[val]) return false;
			arr[val]=true;
		}
			return true;
			
	}
	
public static boolean withoAds(String str){
		
		//boolean[] arr = new boolean[256];
		//String str="abcdefa";
		//
	//int x = 0;
		for (int i=0;i<str.length();i++)
		{
			for (int j=i+1;j<str.length()-i;j++)
			{
				//System.out.println(j + "," + str.charAt(j) + "," + i + "," + str.charAt(i) + "," + str.length());
				if ((str.charAt(j))==str.charAt(i)) return false;
				
			}
			
		}
			
			return true;
			
	}

}
