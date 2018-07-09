package SM;

public class Machine {

	private boolean working=false;
	protected String name = "Machine Type 1";
	public void start() {
		System.out.println("Start machine");
		working=true;
	}
	public void stop() {
		System.out.println("Stop machine");
		working=false;
	}

	
}
