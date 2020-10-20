package _02_boolean._1_sleepy_head;

import java.awt.Color;

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
			isWeekend = true;
		}
		else if(Day .equalsIgnoreCase("Sunday")) {
			isWeekend = true;
		}
		
					
		else {
			 isWeekend = false;
		}
		
		// If it is the weekend, tell the user they get to sleep in.
		if (isWeekend) {
		JOptionPane.showMessageDialog(null, "You can sleep in!!!!");
		}
		else {
		// If it is not the weekend, tell them to get out of bed and go to school!
		JOptionPane.showMessageDialog(null, "Get to school.............QUICK!!!!!");
		}
		
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
		JOptionPane.showMessageDialog(null, "game is over");
		
		/***********************   RED SQUARE  ********************/
		
		boolean isRed;
		// Ask the user what color to draw with. Based on their answer, set the isRed variable
		String Color = JOptionPane.showInputDialog("What color do you want to draw with?");		
		if (Color.equalsIgnoreCase("Red")){
				isRed = true;
		}
		else {
			isRed = false;
		}
		
		boolean isSquare;		
		// Now ask the user what shape to draw. Based on their answer, set the isSquare variable
		String Shape = JOptionPane.showInputDialog("What shape do you want to draw?");
		if (Shape.equalsIgnoreCase("Square")) {
			isSquare = true;
		}
		else {
			isSquare = false;
		}
		// Now you MUST use the && operator to join the booleans for this code. 
		// Ask your teacher if you are not sure how
		// Use an if statement to ONLY draw a red square when it has been requested (use the method below)
		// otherwise, tell the user you don't know how to draw that shape
	if(isRed && isSquare) {
		drawRedSquare();
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry I don't know how to draw that shape");
	}
	
	}
	
	static void drawRedSquare() {
		Robot nugget = new Robot();
		// Complete the rest of this method
	nugget.hide();
	nugget.setPenColor(Color.red);
	nugget.penDown();
	nugget.setSpeed(10000);
	for (int i = 0; i < 4; i++) {
	nugget.move(100);
	nugget.turn(90);
	}
	
	
	
	
	
	
	
	
	}	
}








