import java.io.IOException;

public class killDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pid = 1374;
		
		String query = "kill "+pid;
		try {
			Runtime.getRuntime().exec(query);
			System.out.println("Process with PID :"+691+" terminated");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
