package SM;

class Person{
	private String Name;
	private String Surname;
	
	private int age;
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {return this.Name;}
	
	public void setSurname(String Surname) {
		this.Surname=Surname;
	}
	public String getSurname() {return this.Surname;}	
	
	Person(String Name,String Surname,int age) {this.Name=Name;this.Surname=Surname;this.age=age;}
	public void watchAge() {System.out.print(this.age);}
}



public class App {

	public static void main(String[] args) {

		Person ja = new Person("Szymon","Margañski",21);
		
		System.out.println(ja.getName());
		ja.setName("Maciej");
		
		System.out.println(ja.getName());
		
		System.out.println(ja.getName());
		
		String string = ja.getSurname();
		
		System.out.println(string);

	}

}
