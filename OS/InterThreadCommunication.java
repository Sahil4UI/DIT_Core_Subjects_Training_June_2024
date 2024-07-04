
class Customer{
	int blc = 10000;
	
	synchronized void withdraw(int amount)
	{
		System.out.println("*******Withdrawl Process is starting*******");
		if(blc<amount)
		{
			System.out.println("Insufficient Balance");
			try {
				wait();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Blc updated : "+blc);
		this.blc -= amount;
		System.out.println("Remaining Balance "+blc);
		System.out.println("Withdraw Complete");
		
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Deposit Process Started");
		this.blc += amount;
		System.out.println("Process Completed");
		notify();
	}
}

//wait ->it causes the current thread to wait until another thread invokes the notify for same object

//notify - it wake ups single thread that is waiting
//notifyall - it wakesup all the threads that are waiting
public class InterThreadCommunication {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final Customer obj = new Customer();
			new Thread()
			{
				public void run() {
					obj.withdraw(15000);
				}
			}.start();
			new Thread()
			{
				public void run() {
					obj.deposit(10000);
				}
			}.start();
			
	}

}
