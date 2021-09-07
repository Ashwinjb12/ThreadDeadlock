package thread.deadlock;
class RunnerObject{
	
	public synchronized void runner() {
		System.out.println(Thread.currentThread().getName() + " Line 1");
		System.out.println(Thread.currentThread().getName() + " Line 2");
		System.out.println(Thread.currentThread().getName() + " Line 3");
		System.out.println(Thread.currentThread().getName() + " Line 4");
		System.out.println(Thread.currentThread().getName() + " Line 5");

	}
	
}