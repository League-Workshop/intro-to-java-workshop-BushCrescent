package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot robot = new Robot();

	void go() {
		robot.setSpeed(1000);

		robot.setPenWidth(10);

		for (int i = 0; i < 4; i++) {
			robot.setRandomPenColor();
			drawSquare();
			robot.turn(90);
		}

		// 1. Call the drawSquare() method
		

		// 8. Turn the robot 90 degrees to the right

	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		robot.penDown();
		for (int i = 0; i < 4; i++) {
			robot.move(100);
			robot.turn(-90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
