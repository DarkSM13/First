package SM;

public class Machine implements Info,IStartable {

	private boolean working=false;
	private int id=7;

	public void start() {
		System.out.println("Start machine");
		working=true;
	}
	public void stop() {
		System.out.println("Stop machine");
		working=false;
	}

	public void showInfo() {
		System.out.println("Machine ID = "+id);
		
	}

	
}
