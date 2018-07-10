package SM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main (String[] args) {
		
		File file = new File("text.txt");
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			bw.write("This is new line in the file");
			bw.newLine();
			bw.write("This is second line in the file");
			
			bw.close();
			
	
		} catch (FileNotFoundException e) {
			System.out.println("Can't find file!");
			
		} catch (IOException e) {

			System.out.println("Unable to read file!");
		}
		
		
	}
}
