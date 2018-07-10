package SM;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {


		
		Person mike = new Person(543,"Mike");
		Person sue = new Person(123,"Sue");
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
		ObjectOutputStream os = new ObjectOutputStream(fs);	
			
		os.writeObject(mike);
		os.writeObject(sue);
		
		os.close();
		} catch (FileNotFoundException e) {
			System.out.println("111");
						
		} catch (IOException e) {
					System.out.println("222");
			
		}
	}

}
