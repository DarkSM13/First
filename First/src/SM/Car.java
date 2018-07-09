package SM;

public class Car extends Machine {

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}
	
	@Override
	public void start() {
		System.out.println("Car machine");
	
	}
	public void showInfo() {
		System.out.println("Car name: "+name);
	
	}
}
