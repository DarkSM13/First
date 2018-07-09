package SM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	
	public static void main(String[] args) throws FileNotFoundException {
	
	
		
		String filename="C:\\Users\\Developer12\\Desktop\\example.txt";
		
		File textFile = new File(filename);
		
		System.out.println(textFile.exists());
		
		Scanner in = new Scanner(textFile);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line.toString());
		}
		
		
		
		in.close();
	}
}
