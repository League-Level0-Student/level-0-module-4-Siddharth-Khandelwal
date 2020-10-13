package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What did you score on your last test?");
	double Score = Double.parseDouble(score);
	if(Score >= 80 ) {
		JOptionPane.showMessageDialog(null, "You must have studied hard to get "+Score+"%.");
		}
	else if (Score >= 40) {
		JOptionPane.showMessageDialog(null, "Did you even study, how could you get a "+Score+"%.");
	}
	else {
	JOptionPane.showMessageDialog(null, "You seriously need to get a private tutor, your parents will not\n be happy with a "+Score+"% on your test.");
	}
	}
		
	}
		
	
	

	

	

	
	
	
	
	
	

