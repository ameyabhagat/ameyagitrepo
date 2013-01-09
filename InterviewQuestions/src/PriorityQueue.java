import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class PriorityQueue {

	
	int index=0;
	int size=8;
	Object[] heap=new Object[size];
	
	public void add(int x){
		if(index==size) return;
		
		heapup(heap,x);
	}
	
	public void heapup(Object[] heap, int x){
		
	}
	
	public Object remove(){
		
		if(index==0) {
			return null;
			//System.out.println("Nothing to remove");
			//return Integer.MAX_VALUE;
		}
		
		Object ret=heap[0];
		heap[0]=heap[index-1];
		--index;
		heapdown(heap,0,index-1);
		return ret;
	}
	
	public void heapdown(Object[] heap, int root, int last){
		heap[0]=root;
	}
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int c='v';
		System.out.println(c);
		PriorityQueue p = new PriorityQueue();
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("serial");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("serial");
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fos = new FileOutputStream("serial");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(p); 
	//PriorityQueue p = new PriorityQueue();
	}

}
