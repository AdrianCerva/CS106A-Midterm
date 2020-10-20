package moreMidStuff;

import java.lang.*;

import acm.program.*;

public class removeDuplicates extends ConsoleProgram {
	
	public void run() {
		
		String dupli = removeDuplicates("Moon Soon Door");
		println(dupli);
	}
	
	private static String removeDuplicates(String str) {
		String result = " ";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		if(i==0 || ch != str.charAt(i-1)) {
			result += ch;
		}
		}
		return result;
	}

}
