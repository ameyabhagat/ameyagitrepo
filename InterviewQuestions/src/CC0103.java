
public class CC0103 {

	/**Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
	 * @param args  No right answer?? w/o using additional buffer
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abacd";
		//str.
				
		String resstr=remdup(str.toCharArray());
		System.out.println(resstr);
		
}
	public static String remdup(char[] str){
		
		int j=1,found;
		for (int i=1;i<str.length;i++){
			found=0;
			for(int x=i-1;x>=0&&found==0;x--)
			{
				//System.out.println(i + "," + str[i] + "," + x + "," + str[x]);
				if (str[i]==str[x]){
					found=1;
					//
			}
				
			}
			if (found==0) {
			//	System.out.println(str[j] + "," + str[i]);
				str[j]=str[i];
				j=j+1;
			}
		}
		//return str.toString();
		//for (int v=j+1;v<str.length;v++){
		str[j]=0;
	//	}
		
		for(int k=0;k<j;k++){
			System.out.print(str[k]);
		}
		
		System.out.print(str.toString());
		return str.toString();
		
	}
}
