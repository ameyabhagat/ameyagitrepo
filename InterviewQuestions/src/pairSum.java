import java.util.Hashtable;


public class pairSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {5,6,3,7,6};
		Hashtable<Integer, Integer> h=new Hashtable<Integer, Integer>();
		 for (int i=0;i<arr.length;i++){
			 h.put(arr[i], i);
		 }
		 
		 for(int j=0;j<arr.length;j++){
			 System.out.println(h.get(arr[j]));
		 }
		
	}

}
