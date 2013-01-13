import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s = new HashSet<String>();
		s.add("CA");
		s.add("PA");
		s.add("CA");
		
		Iterator<String> itr=s.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	//	for(int x=0;x<n;x++) System.out.println(arr[x]);
		
	}
	
	
	
	

}
