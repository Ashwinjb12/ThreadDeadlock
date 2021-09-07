package thread.deadlock;

public class ThreadProcessorTwo extends Thread{

	SharedObject object1;
	SharedObject object2;
	
	public ThreadProcessorTwo(SharedObject sb1, SharedObject sb2) {
		// TODO Auto-generated constructor stub
		this.object1 = sb1;
		this.object2 = sb2;
	}
	
	public void run() {
		System.out.println("ThreadProcessorTwo calling the object enterOne");
		object1.enterOne(object2);
		System.out.println("ThreadProcessorTwo finished calling the object enterOne");
	}

}