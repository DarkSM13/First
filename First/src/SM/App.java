package SM;

class Frog{
	
	private int Id;
	
	private String name;
	
	public Frog(int id,String name) {
		this.Id=id;
		this.name=name;
	}
	
	public String toString() {
		
		
		//return String.format("%d: %s", Id,name);
		
		StringBuilder sb = new StringBuilder();
		sb.append(Id).append(": ").append(name);
		return sb.toString();
				}
	
}

public class App {

	
	public static void main(String[] args) {
		
	
	
		
	Frog frog1= new Frog(1,"SM");
	System.out.println(frog1);
	Frog frog2= new Frog(2,"PZ");
	System.out.println(frog2);		
		
	}

}
