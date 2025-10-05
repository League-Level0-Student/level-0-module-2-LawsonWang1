package _01_random._6_lottery_numbers;

	import java.util.Random;

	import javax.swing.JOptionPane;

	public class LotteryNumbers {
		public static void main(String[] args) {

		Random randomMaker = new Random();
		String message = "";
	  	for (int i=0; i<6; i++) {
	  		int randomNumber = randomMaker.nextInt(90)+10;
	  		message += randomNumber;
	  		message += " ";
	  	}
	  	
	  	JOptionPane.showMessageDialog(null, message);
			
			
			
			
			
			
			
			
			
			
			
		}
}