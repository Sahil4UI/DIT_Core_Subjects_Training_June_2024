
class A{
	void methodA(B b) {
		int aHash = System.identityHashCode(this);
		int bHash = System.identityHashCode(b);
		
		if (aHash<bHash)
		{
			synchronized (this) {
				System.out.println("Tthread 1 starts execution of methodA");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
				synchronized (b) {
					b.last();
				}
			}
		}
		else if (aHash>bHash)
		{
			synchronized(b)
			{
				synchronized (this) {
					System.out.println("Thread 1 starts execution of methodA");
					try {
						Thread.sleep(1000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					b.last();
				}
			}
		}
		else {
			synchronized (A.class) {
				synchronized (B.class) {
					System.out.println("Thread 1 starts execution of methodA");
					try {
						Thread.sleep(10000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					b.last();
				}
			}
		}
		
	}
		
		synchronized void last() {
			System.out.println("Inside Last of A");
		}
}

class B{
	
	void methodB(A a) {
		int bHash = System.identityHashCode(this);
		int aHash = System.identityHashCode(a);
		
		if (aHash<bHash)
		{
			synchronized (a) {
				System.out.println("Tthread 2 starts execution of methodB");
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
				
				synchronized (this) {
					a.last();
				}
			}
		}
		else if (aHash>bHash)
		{
			synchronized(this)
			{
				synchronized (a) {
					System.out.println("Thread 2 starts execution of methodB");
					try {
						Thread.sleep(1000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					a.last();
				}
			}
		}
		else {
			synchronized (A.class) {
				synchronized (B.class) {
					System.out.println("Thread 2 starts execution of methodB");
					try {
						Thread.sleep(10000);
					}
					catch (Exception e) {
						// TODO: handle exception
					}
					a.last();
				}
			}
		}
		
	}
		
		synchronized void last() {
			System.out.println("Inside Last of B");
		}
}

class RemoveDeadLockDemo{
	public static void main(String[] args) {
		final A a= new A();
		final B b= new B();
		Thread t1 = new Thread(()-> a.methodA(b));
		Thread t2 = new Thread(()-> b.methodB(a));
		t1.start();
		t2.start();
	}
}