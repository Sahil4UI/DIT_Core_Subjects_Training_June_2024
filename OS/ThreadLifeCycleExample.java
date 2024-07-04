
public class ThreadLifeCycleExample extends Thread {
	
	public void run()
	{
		try {
			System.out.println("Thread is running./././.");
//			waiting state-simulate
			Thread.sleep(2000);
			System.out.println("Thread is waiting");
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadLifeCycleExample t1 = new ThreadLifeCycleExample();
		t1.start();
		try {
			t1.join();
//			wait for the thread to terminate
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Thread Terminated");

	}

}
