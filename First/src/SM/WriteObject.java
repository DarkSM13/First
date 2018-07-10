package SM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObject {

	public static void main(String[] args) {


		
		Person mike = new Person(543,"Mike");
		Person sue = new Person(123,"Sue");
		Person adam = new Person(533,"Adam");
		
		ArrayList<Person> MyList = new ArrayList<Person>();
		
		MyList.add(mike);MyList.add(sue);MyList.add(adam);
		
		
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
		ObjectOutputStream os = new ObjectOutputStream(fs);	
			

		os.writeObject(MyList);
		
		os.close();
		} catch (FileNotFoundException e) {
			System.out.println("111");
						
		} catch (IOException e) {
					System.out.println("222");
			
		}
	}

}
