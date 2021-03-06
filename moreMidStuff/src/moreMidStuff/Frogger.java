package moreMidStuff;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

public class Frogger extends GraphicsProgram {

	private GImage frog; 
	
	public void run() {
	setSize(800, 820);
		
	frog = new GImage("frog.gif");
	double fx = (getWidth() - frog.getWidth()) / 2;
	double fy = getHeight() - frog.getHeight();
	add(frog, fx, fy);
		
	}
	
	public void mouseClicked(MouseEvent event) {
		double mouseY = event.getY();
		double frogTop = frog.getY();
		double frogHeight = frog.getHeight();
		double frogBottom = frogTop + frogHeight;
		if (mouseY < frogTop && frogTop >= frogHeight) {
			frog.move(0, -frogHeight);
			
		}else if (mouseY > frogBottom &&
				  frogBottom + frogHeight <= getHeight()) {
			frog.move(0, frogHeight);
		}
	}
	
	
}
