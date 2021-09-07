package thread.deadlock;

public class ThreadExecution extends Thread {

	RunnerObject object;
	public ThreadExecution(RunnerObject obj) {
		// TODO Auto-generated constructor stub
		this.object = obj;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			object.runner();
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String args[]) {
		
//		SharedObject shanth = new SharedObject("Shanth");
//		SharedObject ashwin = new SharedObject("Ashwin");
//		ThreadProcessorOne t1 = new ThreadProcessorOne(shanth, ashwin);
//		ThreadProcessorTwo t2 = new ThreadProcessorTwo(ashwin, shanth);
//		t1.start();
//		t2.start();

		RunnerObject obj = new RunnerObject();
//		Runnable t1 = new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				obj.runner();
//				
//			}
//		}; 
		
		new Thread(new RunnableThread(obj)).start();
		new Thread(new RunnableThread(obj)).start();
		

	}
	

}
