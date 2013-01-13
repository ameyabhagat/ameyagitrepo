import java.util.Arrays;


public class CC0105 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a b c";
		int count=0;
		char[] str=new char[100];
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ') {
				count=count+1;
			}
		}
		//Arrays.sort(null, null);
		int newl=s.length()+count*2;
		str[newl--]='\0';
		for(int j=s.length()-1;j>=0;j--){
			if(s.charAt(j)!=' '){
				str[newl--]=s.charAt(j);
			}
			else {
				str[newl--]='0';
				str[newl--]='2';
				str[newl--]='%';
			}
		}
		str.toString();
		System.out.println(str);
	}

}
