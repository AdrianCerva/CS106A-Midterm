package moreMidStuff;
import java.lang.*;

import acm.program.*;
import acmx.export.java.util.Scanner;
public class RemveDuplicatesFromFile extends ConsoleProgram {
	
	
	public void run() {
		
	}
	
	private void removeDuplicatesFromFile(Strings filename) {
		try {
			Scanner myReader = new Scanner(new File(filename));
			
			while(myReader.hasNextLine()) {
				String line = myReader.nextLine();
				Scanner tokens = new Scanner(line);
				while(tokens.hasNext()) {
					String word = tokens.next();
					print(removeDuplicates(word) + " ");
				}
				println();
			}
			myReader.close();
		}catch(Exception e) {
			println("file could not be read");
		}
	}

}
