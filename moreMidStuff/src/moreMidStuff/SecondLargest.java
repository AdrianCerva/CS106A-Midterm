package moreMidStuff;

import acm.program.*;

public class SecondLargest extends ConsoleProgram {
	
	private static final int SENTINEL = 0;
	private int secondLargest = 0;
	private int largest = 0;
	private int value = 0;
	
	
	
	public void run() {
		
	
        println("This program finds the two largest integers in a\n"
        		+ "list. Enter values, one per line, using a 0 to\n"
        		+ "signal the end of the list.");
        value = readInt(" ? " );
        
        secondLargest = value;
        largest = value;
        
        if (value == SENTINEL) {
        	println("There are no values entered.");
        	
        }else
        while(value != SENTINEL) {
        	
        rangeEqn(value);
        value = readInt(" ? " );
        }
		printResult();
	}
	
	private void rangeEqn(int value) {
		if(value >= largest) {
			largest = value;
		}else if(largest >= secondLargest) {
			secondLargest = value;
		}
	}
	
	private void printResult() {
		println("The largest value is " + largest);
		println("The second largest is " + secondLargest);
		
		
	}
	

}
