package SM;

/*
 * private - only within same class
 * public - anywher
 * protected - subclass, and same package
 * no modifier - same as above
 */

public class App {

	
	public static void main(String[] args) {
		
		Plant plant = new Plant();
		System.out.println(plant.name);
		System.out.println(plant.ID);
		System.out.println(plant.type);
	}

	
}
