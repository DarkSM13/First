package SM;

class Person{
	private String Name;
	private String Surname;
	
	private int age;
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {return this.Name;}
	
	public void setSurname(String Surnaame) {
		this.Surname=Surname;
	}
	public String getSurname() {return this.Surname;}	
	
	Person(String Name,String Surname,int age) {this.Name=Name;this.Surname=Surname;this.age=age;}
	
}



public class App {

	public static void main(String[] args) {

		Person ja = new Person("Szymon","Marga�ski",21);
		
		System.out.println(ja.getName());
		ja.setName("Maciej");
		
		System.out.println(ja.getName());
		
		

	}

}