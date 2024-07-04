
// we can create thread by two ways : 
// by extending Thread Class
//public class ThreadsDemo extends Thread{
//	public void run() {
//		System.out.println("Thread is running");
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub	
//		ThreadsDemo t1 =new  ThreadsDemo();
//		t1.start();
//
//	}
//
//}


//2. by implementing Runnable Interface
//class ThreadsDemo implements Runnable{
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		System.out.println("Runnable is running...");
//	}
//	
//	public static void main(String[] args) {
//		Thread t1=new Thread(new ThreadsDemo());
//		t1.start();
//	}
//}
