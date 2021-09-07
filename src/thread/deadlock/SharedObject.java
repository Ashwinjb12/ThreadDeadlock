package thread.deadlock;

public class SharedObject {

	private String name ; 
	public SharedObject(String name) {
		// TODO Auto-generated constructor stub
		this.name= name;
	}

	
	public synchronized void enterOne(SharedObject obj) {
		System.out.println(name + " is called by " + Thread.currentThread() + " Entering One");
		obj.enterTwo();
		System.out.println(name + " is called by " + Thread.currentThread() + " Exiting One");
	}
	
	public synchronized void enterTwo() {
		System.out.println(name + " is called by " + Thread.currentThread() + " Entering Two");
		System.out.println(name + " is called by " + Thread.currentThread() + " Exiting Two");
	}
	
	public void print() {
		System.out.println(this.name + " called the method print...");
	}
}