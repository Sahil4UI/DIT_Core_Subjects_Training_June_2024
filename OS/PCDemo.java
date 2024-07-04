class SharedResources{
	private int data;
	private boolean produced  = false;
	
	public synchronized void produce(int data)
	{
		while (produced)
		{
			try {
				wait();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("Produced: "+data);
		produced = true;
		notifyAll();
//		it notify the consumer when data is produce
	}
	
	public synchronized void consume()
	{
		while(!produced)
		{
			try {
				wait();
			}
			catch (Exception e) {
				// TODO: handle exception
				e.fillInStackTrace();
			}
		}
		System.out.println("Consumed : "+data);
		produced = false;
		notifyAll();
//		notify producer when data is consumed
	}
}


class Producer extends Thread{
	private SharedResources resource;
	public Producer(SharedResources resource)
	{
		this.resource = resource;
	}
	
	public void run()
	{
		int data=0;
		while(true)
		{
			resource.produce(data++);
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}


class Consumer extends Thread{
	private SharedResources resource;
	
	public Consumer(SharedResources resource)
	{
			this.resource=resource;
	}	
	
	public void run()
	{
		while(true)
		{
			resource.consume();
			try {
				Thread.sleep(3000);
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}


public class PCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SharedResources resource = new SharedResources();
		Producer producer = new Producer(resource);
		Consumer consumer1 = new Consumer(resource);
		Consumer consumer2 = new Consumer(resource);
		
		producer.start();
		consumer1.start();
		consumer2.start();

	}

}
