
public class RunnableDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new RunnableDemo());
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("Thread is running");
		
	}

}
