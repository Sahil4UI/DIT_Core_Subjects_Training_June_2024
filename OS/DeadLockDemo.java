//
//class A{
//	synchronized void methodA(B b) {
//		System.out.println("Thread 1 starts execution of MethodA");
//		try {
//			Thread.sleep(1000);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			
//		}
//		b.last();
//		
//	}
//		
//		synchronized void last() {
//			System.out.println("Inside Last of A");
//		}
//}
//
//class B{
//	
//	synchronized void methodB(A a) {
//		System.out.println("Thread 2 starts execution of MethodB");
//		try {
//			Thread.sleep(1000);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			
//		}
//		a.last();	
//	}
//	
//	
//	synchronized void last() {
//		System.out.println("Inside Last of B");
//	}
//}
//
//class DeadLockDemo{
//	public static void main(String[] args) {
//		final A a= new A();
//		final B b= new B();
//		Thread t1 = new Thread(()-> a.methodA(b));
//		Thread t2 = new Thread(()-> b.methodB(a));
//		t1.start();
//		t2.start();
//	}
//}