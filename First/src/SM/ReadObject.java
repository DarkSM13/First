package SM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream Os = new ObjectInputStream(fi);
			
			Person person1=(Person)Os.readObject();
			Person person2=(Person)Os.readObject();
			System.out.println(person1);
			System.out.println(person2);
			Os.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("111");
						
		} catch (IOException e) {
					System.out.println("222");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
