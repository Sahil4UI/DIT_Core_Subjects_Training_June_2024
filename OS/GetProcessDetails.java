
import java.lang.ProcessHandle.Info;
import java.util.Optional;

public class GetProcessDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessHandle.allProcesses().forEach(
				process->{
					
					long pid = process.pid();
					Info info = process.info();
					System.out.println("PID = "+pid+"Info : "+info);
					
				});
	}

}
