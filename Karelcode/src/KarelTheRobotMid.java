import stanford.karel.*;

public class KarelTheRobotMid extends SuperKarel {
	
	public void run () {
		firstLIne();
		secondLine();
        fourLine();
	}
	
	
	private void firstLIne() {
		turnLeft();
		move();
		turnRight();
		for(int i = 0; i < 8; i++) {
			move();
			putBeeper();
			
		}
		turnLeft();
	}
		
	private void secondLine() {
		for(int i = 0; i < 7; i++) {
			move();
			putBeeper();
			
		}
		turnLeft();
		for(int i = 0; i < 7; i++) {
			move();
			putBeeper();
			
		}
		turnLeft();
	}
	
	
	private void fourLine() {
		for(int i = 0; i < 6; i++) {
			move();
			putBeeper();
			
		}
		move();
		move();
		turnRight();
		move();
		turnLeft();
		turnLeft();
	}
	
	
	

}
