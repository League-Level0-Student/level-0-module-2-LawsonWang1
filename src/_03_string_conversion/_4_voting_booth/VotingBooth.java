package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
		String age = JOptionPane.showInputDialog("How old are you (in years)");
		int ageAsInt = Integer.parseInt(age);
		if (ageAsInt >= 18) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		} else {
			JOptionPane.showMessageDialog(null, "Unfortunately for you, no one cares what you think.");
		}
	
	
	}
}
