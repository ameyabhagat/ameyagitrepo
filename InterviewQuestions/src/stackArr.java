
public class stackArr {

	/**
	 * @param args
	 */
	
	
	private int top=-1;
	private int stackSize;
	private int[] s;
	
	public stackArr(){
		stackSize=100;
		s = new int[stackSize];
	}
	
	public stackArr(int stackSize){
		s = new int[stackSize];
		this.stackSize=stackSize;
	}
	public void push(int data){
		if (top==stackSize-1){
			System.out.println("Stack Overflow");
			return;
		}
		s[++top]=data;
		
	}
	
	public int getTop(){
		return this.top;
	}
	
	public int maxStacksize(){
		return this.stackSize;
	}
	public boolean isEmpty(){
		if (this.top==-1) return true;
		return false;
	}
	public int pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		return s[top--];
	}
	
}

