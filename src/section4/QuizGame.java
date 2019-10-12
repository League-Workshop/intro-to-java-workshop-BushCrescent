package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
int points = 0;
		
		// 2.  Ask the user a question 
String score = JOptionPane.showInputDialog("What is 1+1?");

		// 3.  Use an if statement to check if their answer is correct
		if(score.equals("2")) {
	points++;
	JOptionPane.showMessageDialog(null, "Correct!");
		}else {
		JOptionPane.showMessageDialog(null, "Oof");
		}
		
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
String secondquestion = JOptionPane.showInputDialog("What is my favorite phone brand?");
	if(secondquestion.equals("Google")) {
		points++;
		JOptionPane.showMessageDialog(null, "Correct!");
	}else {
		JOptionPane.showMessageDialog(null, "Oof");
	}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is " + points);
	}
}

