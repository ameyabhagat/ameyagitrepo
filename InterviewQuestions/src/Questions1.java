
public class Questions1 {

	/**The problem is to determine the dimensions (X * Y) of a grid which is large enough to contain n elements.
	//
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		int x = (int) Math.sqrt(n);
		//System.out.println(x);
        if (x * x == n) {
            System.out.println(x);
            
        }
        x=x+1;
        int y = x;
        
        while (x * y - n > 2) {
            y=y-1;
            while (x*y<n) x++;	//Ameya's solution.
            //x = (n + y - 1) / y;
            //ex:n=42,x=7,y=7, y-1 because if n#y=0, ex:42(7*6) , then we don't want to increment x
        }
        System.out.println(x+","+y);
    
   

	}

}
