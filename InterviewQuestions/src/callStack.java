
public class callStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackArr s1=new stackArr(3);
		stackArr s2=new stackArr(4);
		System.out.println(s1.maxStacksize());
		System.out.println(s2.maxStacksize());
		
		for(int i=0;i<s1.maxStacksize();i++){
			s1.push(2*i);
		}
		
		for(int j=0;j<2;j++){
			s2.push(j*3);
		}
		
		//get all elements from s1
		
		while(!s1.isEmpty()){
			
			System.out.print(s1.pop()+" ");
		}
		System.out.print("\n");
		while(!s2.isEmpty()){
					
			System.out.print(s2.pop()+" ");
		}
	}

}
