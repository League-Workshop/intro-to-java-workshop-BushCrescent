package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot robot = new Robot();
	robot.sparkle();
	robot.setSpeed(100);
	robot.move(100);
	robot.turn(-90);
	robot.setPenColor(255,0,0);
	robot.penDown();
	for(int i=0; i<4; i++) {
		robot.move(100);
		robot.turn(-90);
	}
	robot.penUp();
	robot.turn(90);
	robot.move(-20);
	robot.turn(-90);
	robot.move(20);
	robot.penDown();
	robot.move(100);
	for(int i=0; i<3; i++) {
	robot.turn(-90);
	robot.move(100);
	}
	robot.penUp();
	robot.move(-100);
	robot.turn(45);
	robot.penDown();
	robot.move(29);
	robot.penUp();
	
		
	}
}
