
public class addWithoutPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=15;
		int y=4;
		int carry=0;
		 while(y !=0){
			 carry=x&y;
			 x=x^y;
			 y=carry<<1;
		 }
		
		 System.out.println(x);
		
	}

}
