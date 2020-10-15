package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class SleepyHead {

	public static void main(String[] args) {

		// boolean variables can only hold one of two values - true or false

		/************************  SLEEPY HEAD  **************************/
		boolean isWeekend;
		// Write code to ask the user what day it is.
         String Day = JOptionPane.showInputDialog("What day of the week is it?");
		// Set the boolean isWeekend based on the value they enter
		if (Day .equalsIgnoreCase  ("Saturday")) {
			JOptionPane.showMessageDialog(null, "You can sleep in!!!!");
		}
		else if(Day .equalsIgnoreCase("Sunday")) {
			JOptionPane.showMessageDialog(null, "You can sleep in!!!!");
		}
		else if(Day .equalsIgnoreCase("Monday")) {
			JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		else if(Day .equalsIgnoreCase("Tuesday")) {
			JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		else if(Day .equalsIgnoreCase("Wednesday")) {
			JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		else if(Day .equalsIgnoreCase("Thursday")) {
			JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		else if(Day .equalsIgnoreCase("Friday")) {
			JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Please state a day of the week "+Day+" is not a day");
		}
		// If it is the weekend, tell the user they get to sleep in.
		
		// If it is not the weekend, tell them to get out of bed and go to school!
		
		
		/************************   STAR STUDENT  **************************/

		boolean passedExam;
		// Write code to ask the user what percentage they scored in their last exam
String score = JOptionPane.showInputDialog("What percentage did you score on your last test?");
		
		// If they scored more than 70, they passed the exam.
		// Set the boolean passedExam based on their score.
		int Score = Integer.parseInt(score);
		// If the user passed the exam, congratulate them
		if (Score >= 70) {
			JOptionPane.showMessageDialog(null, "Congratulations on getting "+Score+"% on your exam.");
		}
		else if(Score <= 69) {
			JOptionPane.showMessageDialog(null, "Nice try "+Score+"% is still pretty good.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry "+Score+" is not a score");
		}
		// otherwise, wish them better luck next time.
		
		
		/************************  GAME OVER  **************************/

		boolean gameIsOver = false;
		// This code will repeat until gameIsOver is changed to true
		while (!gameIsOver) {
			// Ask the user if the game is over. 
			String gameOver = JOptionPane.showInputDialog("is game over");
			if (gameOver.equalsIgnoreCase("yes"))
				gameIsOver = true;
			
			// If they answer "yes", change gameIsOver to true
if (gameOver .equals ("yes")) {
	
}
		}
		// Tell the user "game is over" 
		
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		
		
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
		

	}

	
	static void drawRedSquare() {
		Robot rob = new Robot();
		// Complete the rest of this method
	}	
}
