package SM;


	

public class App {


	
	
	public static void main (String[] args) {
		
	
		Animal animal=Animal.CAT;
		
		switch(animal) {
		case CAT:System.out.println("CAT");
			break;
		case DOG:System.out.println("DOG");
			break;
		case MOUSE:System.out.println("MOUSE");
			break;
		default:
			break;

		}
		
		System.out.println(Animal.MOUSE.getName());
		System.out.println(Animal.CAT.toString());
	}
}
