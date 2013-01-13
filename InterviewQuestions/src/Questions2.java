import java.util.Hashtable;




//given an array of ints find all that add up to target

public class Questions2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,2,3};
		int target=8;
		int diff;
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			diff=target-arr[i];
			h.put(diff,1);
		}
		for(int i=0;i<arr.length;i++){
			if(h.containsKey(arr[i])){
				System.out.println(arr[i]+ " , " +(target-arr[i]));
			}
		}		
	}

}
