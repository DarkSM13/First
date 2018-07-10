package SM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("people.bin")){
			
			ObjectInputStream Os = new ObjectInputStream(fi);
			
			//Person person1=(Person)Os.readObject();
			ArrayList<Person> List1 = new ArrayList<Person>();
			
			List1=(ArrayList<Person>) Os.readObject();
		//	Person person2=Os.readObject();
			
			for(Person x:List1)
				System.out.println(x);
			Person mike = new Person(543,"Mike");
			int d=-1;
			for(int l=0;l<List1.size();l++)
			{
			
			  if(mike.equals(List1.get(l))) d=l;
			}
			System.out.println(d);
			
			System.out.println();
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
