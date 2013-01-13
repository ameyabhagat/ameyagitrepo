
public class ThreadEx extends Thread{
	
	int count=0;
	
	public void run(){
		
		System.out.println("Thread Starting...");
		 while (count<5){
			 try{
			 this.count++;
		 }catch(Exception E){}
		 }
		 System.out.println("Thread Ended...");
		 synchronized(this){
		 this.notify();
	}}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx instance = new ThreadEx();
		System.out.println("Spawning Thread now...");
		instance.start();
		try{
		//while(instance.count !=5){
			System.out.println("In main, waiting for notify...");
			
				instance.wait();
			//}
		//}
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Main thread ended...");
	}

}
