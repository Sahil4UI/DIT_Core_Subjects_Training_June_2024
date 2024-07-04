//
//public class SynchronizedExample {
//	private int count = 0;
//	
//	public synchronized void increment()
//	{
//		count++;
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		SynchronizedExample example = new SynchronizedExample();
//		Thread t1 = new Thread(()->{
//			for (int i=0;i<1000;i++)
//			{
//				example.increment();
//			}
//		});
//		System.out.println("*****************");
//		Thread t2 = new Thread(()->{
//			for (int i=0;i<1000;i++)
//			{
//				example.increment();
//			}
//		});
//		t1.start();
//		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		System.out.println("Final Count : "+example.count);
//	}
//}


