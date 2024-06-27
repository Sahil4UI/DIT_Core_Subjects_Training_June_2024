import java.io.IOException;

public class ProcessDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] query = {"open","-a","/Applications/Safari.app"};
		
		ProcessBuilder processBuilder = new ProcessBuilder(query);
		
		try {
			Process process = processBuilder.start();
			System.out.println("Process Started");
			Thread.sleep(5000);
//			process.destroy();
//			System.out.println("Process Destroyed");
//			
//			if (process.isAlive())
//			{
//				System.out.println("hey");
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
