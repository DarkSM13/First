package SM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {

	
	public static void main(String[] args) {
	
	
	ArrayList list = new ArrayList();
	
	list.add("apple");
	list.add("orange");
	list.add("banana");		
	
	String fruit =(String)list.get(1);
	
	System.out.println(fruit.toString());
	
	//////////////////////////////////
	ArrayList<String> strings = new ArrayList<String>();
	
	strings.add("cat");
	strings.add("dog");
	strings.add("alligator");
	
	String animal=strings.get(1);
	System.out.println(animal);
	///////////////////////////////////////////////////////
	
	ArrayList<Animal> someList = new ArrayList<>();
	Animal snake=new Animal("Snake");
	
	Animal dog=new Animal("dog");
	
	someList.add(snake);
	someList.add(dog);
	
	Animal find = someList.get(0);
	System.out.println(find.getName());

	//////////////////////////////////////////////////////////
	
	
	
	
	}
}
