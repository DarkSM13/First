package SM;

class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
	
	
}
public class App {

	public static void main (String[] args) {
		
		
		Person person1 = new Person(5,"Szymon");
		Person person2 = new Person(5,"Szymon");
		
		if(person1==person2)
			System.out.println("1 - true");
		else System.out.println("1 - false");
		
		
		
		if(person1.equals(person2))
			System.out.println("2 - true");
		else System.out.println("2 - false");
		
		Double value1=7.2;
		Double value2=7.2;
		
		System.out.println(value1.equals(value2));
		
		
	}
}
