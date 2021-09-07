package thread.deadlock;

public class RunnableThread implements Runnable {

	private RunnerObject obj;
	public RunnableThread(RunnerObject obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	     
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		obj.runner();
	}
}
